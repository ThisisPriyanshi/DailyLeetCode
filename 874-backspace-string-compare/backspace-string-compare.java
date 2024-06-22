class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        //for string S
        for(char ch : s.toCharArray())
        {
            if(ch != '#')
            {
                sStack.push(ch);
            }
            else if( !sStack.isEmpty())
            {
                sStack.pop();
            }
        }

        // for t string
        for(char ch : t.toCharArray())
        {
            if(ch != '#')
            {
                tStack.push(ch);
            }
            else if( !tStack.isEmpty())
            {
                tStack.pop();
            }
        }

        StringBuilder sBuild = new StringBuilder();
        StringBuilder tBuild = new StringBuilder();

        while(!sStack.isEmpty())
        {
            sBuild.append(sStack.pop());
        }

        while(!tStack.isEmpty())
        {
            tBuild.append(tStack.pop());
        }

        return sBuild.toString().equals(tBuild.toString());
    }
}