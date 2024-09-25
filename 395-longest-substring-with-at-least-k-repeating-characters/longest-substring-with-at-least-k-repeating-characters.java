class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s.toCharArray(),0, s.length(),k);
    }

    public int helper(char[] myArr, int start, int end, int k)
    {
        if(end- start < k)
        return 0;

        int[] count = new int[26];//only lowercase letters
        for(int i = start; i < end; i++)
        {
            count[myArr[i] - 'a']++;
        }

        //now i have counted all occurences we look for first invalid and second invalid and then return their difference as the longestvalid

        for(int i = start; i < end; i++)
        {
            if(count[myArr[i] - 'a'] < k)
            {
                int j = i+1;

                while(j < end && count[myArr[j]-'a'] < k)
                {
                    j++;
                }

                return Math.max(helper(myArr,start,i,k), helper(myArr,j, end,k));
            }
        }

        return end-start;
    }
}