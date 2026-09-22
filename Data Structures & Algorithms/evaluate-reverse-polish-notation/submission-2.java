class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result=0;
        for(String s:tokens){
            if(s.equals("*")){
                result=stack.pop()*stack.pop();
                stack.push(result);
            }else if(s.equals("+")){
                result=stack.pop()+stack.pop();
                stack.push(result);

            }else if(s.equals("-")){
                int a=stack.pop();
                int b=stack.pop();
                result=b-a;
                stack.push(result);

            }else if(s.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                result=b/a;
                stack.push(result);

            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
