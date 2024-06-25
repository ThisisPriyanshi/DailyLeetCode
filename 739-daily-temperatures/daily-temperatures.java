class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        //create result array
        int size = temperatures.length;
        int[] result = new int[size];

        Stack<Integer> myStack = new Stack<>();

        for(int i = 0; i <temperatures.length; i++)
        {
            while(!myStack.isEmpty() && temperatures[myStack.peek()] < temperatures[i] )
            {
                result[myStack.peek()] = i - myStack.pop();
            }

            //add current count of days on the stack
            myStack.push(i);
        }

        return result;
    }
}