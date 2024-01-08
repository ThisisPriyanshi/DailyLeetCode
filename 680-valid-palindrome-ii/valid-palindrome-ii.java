class Solution {
    public boolean validPalindrome(String s) {
        
        int start = 0;
        int end = s.length() - 1;
        boolean del = false;

        return isPalindrome(s, start, end, del);
    }

    public boolean isPalindrome(String str, int leftPointer, int endPointer, boolean deleted)
    {
        while( leftPointer <= endPointer)
        {
            if(str.charAt(leftPointer) != (str.charAt(endPointer)))
                {
                    if(deleted)
                        {
                            return false;
                        }
                    return (isPalindrome(str, leftPointer+1, endPointer, true) || isPalindrome(str, leftPointer, endPointer-1, true));
                }

                leftPointer++;
                endPointer--;
        }

        return true;
    }
}