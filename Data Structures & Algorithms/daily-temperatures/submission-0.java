class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int counter=0;
            for(int j=i+1;j<temperatures.length;j++){
                counter++;
                if(temperatures[j]>temperatures[i]){
                    result[i]=counter;
                    break;
                }
            }
            if(counter==0){
                result[i]=0;
            }
        }
        return result;
        
    }
}
