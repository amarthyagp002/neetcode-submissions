class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Float> stack = new Stack<>();
        for(int i=0;i<position.length;i++){
            for(int k = 0;k<position.length-i-1;k++){
                if(position[k]<position[k+1]){
                    int temp1=position[k];
                    int temp2=speed[k];
                    position[k]=position[k+1];
                    position[k+1]=temp1;
                    speed[k]=speed[k+1];
                    speed[k+1]=temp2;
                }
            }
        }
        for(int i=0;i<position.length;i++){
            float time=(float)(target-position[i])/speed[i];
            if(stack.isEmpty() || time>stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();
    }
}
