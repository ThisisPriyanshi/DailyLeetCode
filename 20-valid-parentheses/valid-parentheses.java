class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        for( char ch : s.toCharArray())
        {
            if (ch == '(')
            myStack.push(')');

            else if (ch == '{')
            myStack.push('}');

            else if(ch == '[')
            myStack.push(']');

            else if((myStack.isEmpty()) || myStack.pop() != ch)
            return false;
        }

        return myStack.isEmpty();
    }
}