class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder result = new StringBuilder();
        int openBracket = 0;
        for(char ch : s.toCharArray())
        {
            if (ch == '(')
            {
                if(openBracket > 0)
                {
                    result.append(ch);
                }
                openBracket++;
            }
            else
            {
                if(openBracket > 1)
                {
                    result.append(ch);
                }
                openBracket--;
            }
        }

        return result.toString();
    }
}