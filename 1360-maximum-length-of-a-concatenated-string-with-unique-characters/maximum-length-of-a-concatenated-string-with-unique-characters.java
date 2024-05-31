class Solution {
    public int maxLength(List<String> arr) {
        int[] charCheck = new int[26];
        return findMaxLength(0, arr, charCheck, 0);
    }

    private int findMaxLength(int index, List<String> list, int[] checkArr, int lengthTillNow)
    {
        //base statement
        if( index == list.size())
        { //we have reached the end of the list return the length we have stored till now. 
            return lengthTillNow;
        }

        //if we have not reached the end

        String currString = list.get(index);

        //now we check if we can pick this string 
        if(compare(currString, checkArr) == false)
        {
            //if its false we can not pick this so we go to next index 
            return findMaxLength(index+1, list, checkArr, lengthTillNow);
        }
        else
        { //if it returns true --> that means we have two options, one to pick and one to ignore

            //pick the currString
            //if we decide to pick the currString we have to first mark all characters

            for(int stringIndex = 0; stringIndex < currString.length(); stringIndex++)
            {
                char ch = currString.charAt(stringIndex);
                int marker = ch - 'a';

                checkArr[marker] = 1;
            }

            //increase length after adding
            lengthTillNow += currString.length();

            //call recursion to move forwad
            int lengthWhenPicked = findMaxLength(index+1, list, checkArr, lengthTillNow);

            //now we have to ignore this 
            //first we backtrack

            for(int k = 0; k < currString.length(); k++)
            {
                char ch = currString.charAt(k);
                int marker = ch - 'a';

                checkArr[marker] = 0;
            }

            lengthTillNow -= currString.length();

            //now we ignore the string
            int lengthWhenIgnored = findMaxLength(index+1, list, checkArr, lengthTillNow);

            return Math.max(lengthWhenIgnored, lengthWhenPicked);

        }
    }

    private boolean compare(String str, int[] markerArr)
    {
        //we check if the characters of the string sent are already marked or not
        //first we make sure there are no repeating characters in this string itself

        int[] selfCheckArr = new int[26];
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            int marker = ch - 'a';

            if( selfCheckArr[marker] == 1)
            return false;

            selfCheckArr[marker] = 1;
        }

        //now we check with our marker array
        for (int j = 0; j < str.length(); j++)
        {
            // If currCharacter is already taken, it means we cannot take currString, thus we return false
            
            int marker = str.charAt(j) - 'a';

            if (markerArr[marker] == 1)
                return false ;
        }

        return true;

    }
}