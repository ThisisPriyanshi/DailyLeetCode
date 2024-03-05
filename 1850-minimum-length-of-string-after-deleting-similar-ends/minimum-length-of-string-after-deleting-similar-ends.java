class Solution {
    public int minimumLength(String s) {
        char[] myCharacters = s.toCharArray();

        int len = myCharacters.length;
        int start = 0;
        int end = len - 1;

        while(end > start)
        {
            if(myCharacters[start] != myCharacters[end])
            break;

            char c = myCharacters[start];

            while((end >= start) && (myCharacters[start] == c))
            {
                start++;
            }

            while((end >= start) && (myCharacters[end] == c))
            {
                end--;
            }
        }

        return end - start + 1;
    }
}