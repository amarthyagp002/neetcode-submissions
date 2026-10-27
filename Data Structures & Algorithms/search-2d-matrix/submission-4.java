class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if( matrix == null || matrix.length ==0){
            return false;
        }
        int r =matrix[0].length-1;
        int row=-1;
        for(int i=matrix.length-1;i>=0;i--){
            if(target==matrix[i][0]){
                return true;
            }
            else if(target>matrix[i][0]){
                row=i;
                break;
            }
        }
        if(row==-1){
            return false;
        }
        int l = 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if( matrix[row][mid]>target){
                r--;
            }else{
                l++;
            }
        }
        return false;
        
    }
}
