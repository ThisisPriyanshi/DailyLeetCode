class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int size = temperatures.length;
        int[] result = new int[size];

        Stack<Integer> myStack = new Stack<>();
        
        //iterating through the array
        for(int i = 0; i < temperatures.length; i++)
        {
            while (!myStack.isEmpty() && temperatures[myStack.peek()] < temperatures[i]) 
            {
                result[myStack.peek()] = i - myStack.pop();
            }

            myStack.push(i);
        }

        return result;
        
    }
}