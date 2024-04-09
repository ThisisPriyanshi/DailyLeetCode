class Solution {
    public int reverse(int x) {

        long reversedNumber = 0;
        while(x!=0)
        {
            int dig = x % 10;
            reversedNumber = reversedNumber * 10 + dig;
            x = x/10;
        }

        if(reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE)
        return 0;


        return (int) reversedNumber;
        
    }
}