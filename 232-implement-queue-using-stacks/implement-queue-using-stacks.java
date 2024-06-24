class MyQueue {

    Stack <Integer> myStack;
    Stack <Integer> myStack2;

    public MyQueue() {

        myStack = new Stack<>();
        myStack2 = new Stack<>();

    }
    
    public void push(int x) {
        myStack.push(x);
    }
    
    public int pop() {
        while(!myStack.isEmpty())
        {
            myStack2.push(myStack.pop());
        }

        int ans = myStack2.pop();
        while(!myStack2.isEmpty())
        {
            myStack.push(myStack2.pop());
        }

        return ans;
    }
    
    public int peek() {
        while(!myStack.isEmpty())
        {
            myStack2.push(myStack.pop());
        }

        int ans = myStack2.peek();
        while(!myStack2.isEmpty())
        {
            myStack.push(myStack2.pop());
        }

        return ans;
        
    }
    
    public boolean empty() {
        return myStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */