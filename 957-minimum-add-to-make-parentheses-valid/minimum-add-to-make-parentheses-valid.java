class Solution {
    public int minAddToMakeValid(String s) {
        int counter = 0;

        Stack <Character> myStack = new Stack<>();
        for( char c : s.toCharArray())
        {
            if ( c == '(')
            myStack.push(')');
            else if( (!myStack.isEmpty()) && myStack.peek() == c)
            myStack.pop();
            else
            counter++;
        }

        while(!myStack.isEmpty())
        {
            myStack.pop();
            counter++;
        }

        return counter;
    }
}