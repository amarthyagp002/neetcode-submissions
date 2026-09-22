class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }

        }
        // converting the hashmap into entry set like touples in which sorting can be 
        // performed we make that entry set inside array.
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        // sort that entrySet list in the decreasing order
        list.sort((a,b)->b.getValue()-a.getValue());
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i]=list.get(i).getKey();
        }
        return arr;
        
        
    }
}
