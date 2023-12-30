class Solution {
    public int addDigits(int num) {
        
        if( num == 0)
        return 0;

        while( num > 9)
        {   
            int copy = num;
            int sum = 0;
            while( copy > 0)
            {
                int dig = copy%10;
                sum = sum + dig;
                copy = copy/10;
            }
            num = sum;
        }

        return num;
    }
}