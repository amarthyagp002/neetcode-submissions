class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int[] ar =new int[2];
        while(left<right){
            int midvalue=numbers[left]+numbers[right];
            if(midvalue==target){
                ar[0]=left+1;
                ar[1]=right+1;
                break;
            }else if(target<midvalue){
                right-=1;
            }else{
                left+=1;
                
            }
            
        }  
        return ar; 

        
    }
}
