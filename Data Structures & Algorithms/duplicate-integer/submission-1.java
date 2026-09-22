class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> s = new HashSet<>();
        for(int i=0 ; i<n-1 ;i++){
            s.add(nums[i]);
            if(s.contains(nums[i+1])){
                return true;
            }
        }
        return false;
    }
}