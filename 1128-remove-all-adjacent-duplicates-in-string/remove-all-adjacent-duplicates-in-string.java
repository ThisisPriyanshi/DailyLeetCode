class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> myStack = new Stack<>();
        char[] sArray = s.toCharArray();
        myStack.push(sArray[0]);

        for(int i = 1; i < sArray.length; i++)
        {

            char ch = sArray[i];
            if(!myStack.isEmpty() && ch != myStack.peek())
            myStack.push(ch);
            else if(!myStack.isEmpty())
                myStack.pop();
            else
                myStack.push(ch);
        }

        StringBuilder str = new StringBuilder();
        while(!myStack.isEmpty())
        {
            str.append(myStack.pop());
        }

        return str.reverse().toString();
    }
}