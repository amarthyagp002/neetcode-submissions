class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a1 = new int[nums.length];
        int[] a2 = new int[nums.length];
        a1[0]=nums[0];
        for(int i= 1;i<nums.length ; i++){
            a1[i]=a1[i-1]*nums[i];
        }
        int x=nums.length-1;
        a2[x]=nums[x];
        for(int i= nums.length-2;i>=0 ; i--){
            a2[i]=a2[i+1]*nums[i];
        }
        int[] a3 = new int[nums.length];
        a3[0]=a2[1];
        a3[x]=a1[x-1];
        for(int i=1;i<nums.length-1;i++){
            a3[i]=a1[i-1]*a2[i+1];
        }
        return a3;


    }
}  
