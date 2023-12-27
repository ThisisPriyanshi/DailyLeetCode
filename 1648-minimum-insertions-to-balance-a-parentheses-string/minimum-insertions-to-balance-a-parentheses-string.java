class Solution {
    public int minInsertions(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for( int i = 0; i < s.length() ; i++)
        {
            char c = s.charAt(i);

            if( c == '(')
            {
                stack.push(')');
            }
            else
            {
                if( i+1 < s.length() && s.charAt(i+1) == ')')
                {
                    i++;
                }
                else
                {
                    count++;
                }

                if(!stack.isEmpty())
                {
                    stack.pop();
                }
                else
                {
                    count++;
                }
            }
        }

         count += 2 * stack.size();
        return count;
        
    }
}
