class Solution {
    public boolean validPalindrome(String s) {
        int startP = 0;
        int endP = s.length()-1;
        boolean deleted = false;

        return isPalindrome(startP, endP, deleted, s);
    }

    private boolean isPalindrome(int start, int end, boolean flag, String str)
    {
        while(start <= end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                if(flag)
                {
                    return false;
                }
            return (isPalindrome(start+1, end, true, str) || isPalindrome(start, end-1, true, str));
            }

            start++;
            end--;
        }
        return true;
    }
}