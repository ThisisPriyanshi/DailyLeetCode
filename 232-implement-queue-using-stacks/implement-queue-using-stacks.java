class MyQueue {

    private Stack <Integer> myStackQ = new Stack<>();
    private Stack <Integer> myHelper = new Stack<>();
    
    public void push(int x) {

        myStackQ.push(x);
       
    }
    
    public int pop() {
        while(!myStackQ.isEmpty())
        {
            myHelper.push(myStackQ.pop());
        } // helper stack now has all values reversed

        int popped =  myHelper.pop();
        //first element removed

        while(!myHelper.isEmpty())
        {
            myStackQ.push(myHelper.pop());
        } // queue is set again in main stack

        return popped;
    }
    
    public int peek() {
        while(!myStackQ.isEmpty())
        {
            myHelper.push(myStackQ.pop());
        } // helper stack now has all values reversed

        int peekValue = myHelper.peek();
        //first element peeked

        while(!myHelper.isEmpty())
        {
            myStackQ.push(myHelper.pop());
        } // queue is set again in main stack

        return peekValue;
    }
    
    public boolean empty() {
        return myStackQ.isEmpty();
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