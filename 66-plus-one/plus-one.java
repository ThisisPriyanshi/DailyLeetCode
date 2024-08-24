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

        //meaning all digits are 9
        int[] newDig = new int[digits.length+1];
        newDig[0] = 1;
        return newDig;

    }
}