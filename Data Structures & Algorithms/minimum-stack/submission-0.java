class MinStack {
    private Stack<Integer> stack;
    private int[] arr= new int[10];
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        
        int i=0;
        int min=this.top();
    while(!stack.isEmpty()){
        int data = stack.pop();
        if(data<min){
            min=data;
        }
        arr[i]=data;
        i++;
    }
    i--;
    while(i>=0){
        stack.push(arr[i]);
        i--;
    }
    return min;

    }
}
