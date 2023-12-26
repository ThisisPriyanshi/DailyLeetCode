class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> myStack = new Stack<>();
        int max = 0;
        myStack.push(0);

        for(int i = 1; i < heights.length; i++)
        {
            while((!myStack.isEmpty()) && (heights[i] < heights[myStack.peek()]))
            {
             max = getMax(heights, myStack, max, i);
            }

        myStack.push(i);
        }

        int i = heights.length;
        while(!myStack.isEmpty())
        {
            max = getMax(heights, myStack, max, i);
        }

        return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i)
    {
        int area;
        int popped = stack.pop();
        if(stack.isEmpty())
        {
            area = arr[popped] * i;
        }
        else
        {
            area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);
    }
}