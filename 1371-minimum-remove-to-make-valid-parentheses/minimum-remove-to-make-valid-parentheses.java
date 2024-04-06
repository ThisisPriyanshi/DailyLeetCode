class Solution {
    public String minRemoveToMakeValid(String s) {
        
        String result = "";
        char[] myArray = s.toCharArray(); // chnaging to character array for easy manipulation

        int openBracket = 0;
        int closeBracket = 0;
        //Traversing array from right to left to mark extra closing brackets
        for(int i = 0; i < myArray.length; i++)
        {
            if( myArray[i] == '(')
            {
                openBracket++;
            }
            else if ( myArray[i] == ')')
            {
                if(openBracket == 0)
                {
                    myArray[i] = '*';
                }
                else
                {
                    openBracket--;
                }
            }
        }

        //Traversing array from left to right to mark extra opening brackets
        for( int j = myArray.length - 1; j >= 0; j--)
        {
            if((openBracket > 0) && (myArray[j] == '('))
            {
                myArray[j] = '*';
                openBracket--;
            }
        }

        for( char ch : myArray)
        {
            if ( ch == '*')
            continue;
            else
            result = result + ch;
        }


    return result;
    }
}