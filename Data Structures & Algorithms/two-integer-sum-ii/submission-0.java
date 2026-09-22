class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int f,s;
        Map<Integer,Integer> map = new HashMap<>();
        int[] ar= new int[2];
        for(int i=0;i<numbers.length;i++){
            int secNumber=target-numbers[i];
            if(map.containsKey(secNumber)){
                ar[1]=i+1;
                ar[0]=map.get(secNumber)+1;
                break;
            }else{
                map.put(numbers[i],i);
            }
        }
        return ar;

        
    }
}
