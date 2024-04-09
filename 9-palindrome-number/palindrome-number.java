class Solution {
    public boolean isPalindrome(int x) {
        
        int copy = x;
        int reverse = 0;
        while(copy > 0)
        {
            int dig = copy % 10;
            reverse = reverse * 10 + dig;
            copy = copy/10;
        }

        if (reverse == x)
        return true;
        else
        return false;
    }
}