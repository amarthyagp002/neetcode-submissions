class Solution {
    public int maxArea(int[] heights) {
        int j= heights.length-1;
        int i=0;
        int min=0;
        int index=-1;
        int maxArea=0;
        while(i<j){
            if(heights[i]<heights[j]){
                min=heights[i];
            }else{
                min=heights[j];
            }
            int c=min*(j-i);
            if(c>maxArea){
                maxArea=c;
            }
            if(heights[i]>heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxArea;
        
    }
}
