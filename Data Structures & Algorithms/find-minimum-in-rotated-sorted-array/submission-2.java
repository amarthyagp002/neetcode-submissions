class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int l=0;
        int r=nums.length-1;
        int mid=0;
        while(l<r){
            mid=(l+r)/2;
            if(nums[r]<nums[mid]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return nums[l];
        
    }
}
