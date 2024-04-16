class Solution {
    public int calculate(String s) {
        Stack<Integer> myStack = new Stack<>();

        int myNumber = 0;
        int calculated = 0;
        int sign = 1;

        for(int i = 0; i < s.length(); i++)
        {   
            char ch = s.charAt(i);
            if(ch == '(')
            {
                myStack.push(calculated);
                myStack.push(sign);
                calculated = 0;
                sign = 1;
            }
            else if(ch == ')')
            {
                calculated += myNumber * sign;
                myNumber = 0;
                calculated *= myStack.pop();
                calculated += myStack.pop();
            }
            else if (ch == '+')
            {
                calculated += myNumber * sign;
                myNumber = 0;
                sign = 1;
            }
            else if(ch == '-')
            {
                calculated += myNumber * sign;
                myNumber = 0;
                sign = -1;
            }
            else if(Character.isDigit(ch))
            {
                myNumber = myNumber * 10 + (int)(ch - '0');
            }
        }

        if(myNumber > 0)
        calculated += myNumber * sign;

        return calculated;
    }
}