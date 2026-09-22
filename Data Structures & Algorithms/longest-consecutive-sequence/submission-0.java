class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> start = new HashSet<>();
        for(int i :nums){
            set.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                start.add(nums[i]);
            }
        }
        int max=0;
        for(int i:start){
            int l=0;
            while(set.contains(i)){
                i++;
                l++;
            }
            if(l>max){
                max=l;
            }
        }
        return max;
        
        
    }
}
