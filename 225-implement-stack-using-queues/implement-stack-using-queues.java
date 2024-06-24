class MyStack {

    Queue <Integer> myQueue;
    Queue <Integer> myQueue2;

    public MyStack() {

        myQueue = new LinkedList<>();
        myQueue2 = new LinkedList<>();
    }
    
    public void push(int x) {

        while(!myQueue.isEmpty())
        {
            myQueue2.add(myQueue.remove());
        }

        myQueue.add(x);

        while(!myQueue2.isEmpty())
        {
            myQueue.add(myQueue2.remove());
        }

        
    }
    
    public int pop() {

        return myQueue.remove();
        
    }
    
    public int top() {
        return myQueue.peek();
    }
    
    public boolean empty() {
        return myQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */