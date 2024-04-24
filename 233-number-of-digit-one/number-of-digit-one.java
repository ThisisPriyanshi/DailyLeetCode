class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        //iterating for each didgit's place
        for(int i = 1; i <= n; i *= 10)
        {
            int divisor = i * 10;
            int quotient = n / divisor;
            int remainder = n % divisor;

            count += quotient * i;

            //now checking for remainder
            if(remainder >= 2 * i)
            {
                count += i;
            }
            else if(remainder >= i)
            {
                count += remainder - i + 1;
            }
        }

        return count;
}

}