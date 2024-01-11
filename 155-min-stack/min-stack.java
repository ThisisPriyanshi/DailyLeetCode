class MinStack {

    Stack<Integer> myStack;
    Stack<Integer> minStack;

    public MinStack() {
        myStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        myStack.push(val);
       int min = Math.min(minStack.isEmpty()? val : minStack.peek(), val);
       minStack.push(min);
    }
    
    public void pop() {
        myStack.pop();
        minStack.pop();
    }
    
    public int top() {
       int top = myStack.peek();
       return top;
    }
    
    public int getMin() {
        int minValue = minStack.peek();
        return minValue;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */