class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=1;
        int max=0;
        while(j<prices.length){
            if(prices[j]-prices[i]>=max){
                max=prices[j]-prices[i];
            }
            if(prices[i]>prices[j]){
                i++;
            }else{
                j++;
            }
            
        }
        return max;
        
    }
}
