class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            else
            {
                digits[i] = 0;
            }
        }

        //all digits are 9
        int[] myNumber = new int[digits.length+1];
        myNumber[0] = 1;
        return myNumber;
    }
}