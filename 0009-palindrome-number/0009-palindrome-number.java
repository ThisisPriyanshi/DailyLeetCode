class Solution {
    public boolean isPalindrome(int x) {

    int copy = x;
    int reverse = 0;
    while(copy>0)
    {
        int lastDig = copy%10;
        reverse = reverse * 10 + lastDig;
        copy = copy/10;
    }

    if(x == reverse)
    return true;
    else
    return false;
    }
}