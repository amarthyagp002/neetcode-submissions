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
        List<Integer>[] list = new ArrayList[nums.length+1];
        for(int key : map.keySet()){
            int value = map.get(key);
            if(list[value]==null){
                list[value]=new ArrayList<>();
            }
            list[value].add(key);
        }
        int[] array = new int[k];
        int j=0;
        for(int i=nums.length;i>=0;i--){
            if(list[i]!=null){
                for(int m:list[i]){
                    array[j]=m;
                    j++;
                    if(j==k){
                        return array;
                    }   
                }
            }
        }
        return array;
        
    }
}
