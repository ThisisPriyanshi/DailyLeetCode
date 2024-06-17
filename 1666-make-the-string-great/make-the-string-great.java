class Solution {
    public String makeGood(String s) {
        Stack<Character> myStack = new Stack();

        myStack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++)
        {
            char z = s.charAt(i);
            if(!myStack.isEmpty() && ((z - myStack.peek() == 32) || (myStack.peek()-z ==32)))
            {
                myStack.pop();
            }
            else
            {
                myStack.push(z);
            }
        }

        String finalString = "";
        while(!myStack.isEmpty())
        {
            finalString = myStack.peek() + finalString;
            myStack.pop();
        }

        return finalString;
    }
}