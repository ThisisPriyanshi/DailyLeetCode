class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i = (digits.length - 1); i >= 0 ; i--)
        {
            if( digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            else
            {
                digits[i] = 0;
            }
        }
        //when there is only 9 in the input

        int[] myDigits = new int[digits.length + 1];
        myDigits[0] = 1;
        return myDigits;
    }
}