class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack <Character> sStack = new Stack<>();
        Stack <Character> tStack = new Stack<>();

        for( char ch : s.toCharArray())
        {
            if(ch != '#')
            {
                sStack.push(ch);
            }
            else
            {
                if(!sStack.isEmpty())
                {
                    sStack.pop();
                }
            }
        }

        for( char ch : t.toCharArray())
        {
            if(ch != '#')
            {
                tStack.push(ch);
            }
            else
            {
                if(!tStack.isEmpty())
                {
                    tStack.pop();
                }
            }
        }

        StringBuilder sSB = new StringBuilder();
        StringBuilder tSB = new StringBuilder();

        while(!sStack.isEmpty()) {
            sSB.append(sStack.pop());
        }

        while(!tStack.isEmpty()) {
            tSB.append(tStack.pop());
        }

        return tSB.toString().equals(sSB.toString());
    }
}