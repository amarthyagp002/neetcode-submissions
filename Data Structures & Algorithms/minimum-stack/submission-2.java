class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer>stack1=new Stack<>();
    public MinStack() {
        stack = new Stack<>();
    }
    
     public void push(int val) {
        if(stack1.isEmpty()||val<stack1.peek()){
            stack1.push(val);
        }else{
            stack1.push(stack1.peek());
        }
        stack.push(val);
        
        
    }
    
    public void pop() {
        stack.pop();
        stack1.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() { 
    return stack1.peek();

    }
}
