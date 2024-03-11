class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> brackets = new Stack<Character>();

        for(int i = 0; i <s.length(); i++)
        {   
            char ch = s.charAt(i);
            if(ch == '(')
            {
                brackets.push(')');
            }
            else if(ch == '{')
            {
                brackets.push('}');
            }
            else if (ch == '[')
            {
                brackets.push(']');
            }
            else if(brackets.isEmpty() || brackets.pop() != ch) 
            {
                return false;
            }
        }
        return brackets.isEmpty();
    }
}