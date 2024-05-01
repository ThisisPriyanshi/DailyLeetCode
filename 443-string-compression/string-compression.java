class Solution {
    public int compress(char[] chars) {
        
        int indexToStore = 0;

        for(int i = 0; i < chars.length;)
        {
            char ch = chars[i];
            int runningCount = 0;

            while( i < chars.length && chars[i] == ch)
            {
                runningCount++;
                i++;
            }

            chars[indexToStore++] = ch;

            if(runningCount > 1)
            {
                for( char c : String.valueOf(runningCount).toCharArray())
                {
                    chars[indexToStore++] = c;
                }
            }     
        }    

        return indexToStore;   
    }
}