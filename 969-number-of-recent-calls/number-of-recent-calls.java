class RecentCounter {

    Queue<Integer> myQueue;

    public RecentCounter() {
        myQueue = new LinkedList();
    }
    
    public int ping(int t) {
        myQueue.add(t);
        while (myQueue.peek() < t - 3000)
            myQueue.poll();
        return myQueue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */