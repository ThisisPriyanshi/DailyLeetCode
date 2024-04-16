class Solution {
    public int calculate(String s) {
        Stack<Integer> myStack = new Stack<>();

        int sign = 1;
        int myNumber = 0;
        int result = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if( ch == '(')
            {
                myStack.push(result);
                myStack.push(sign);
                sign = 1;
                result = 0;
            }
            else if( ch == ')')
            {
                result += sign * myNumber;
                myNumber = 0;
                result *= myStack.pop(); //multiplied by sign
                result += myStack.pop(); //add the number created (can be positive or negative)
            }
            else if(Character.isDigit(ch))
            {
                myNumber = myNumber * 10 + (int)(ch - '0');
            }
            else if(ch == '+')
            {
                result += sign * myNumber;
                myNumber  = 0;
                sign = 1;
            }
            else if(ch == '-')
            {
                result += sign * myNumber;
                myNumber = 0;
                sign = -1;
            }
        }

        if(myNumber != 0)
        result += myNumber * sign;

        return result;    
    }
}