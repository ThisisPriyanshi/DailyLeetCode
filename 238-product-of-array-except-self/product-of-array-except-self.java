class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] myResult = new int[nums.length];

        int LeftToRight = 1;
        for(int i = 0; i < nums.length; i++)
        {
            myResult[i] = LeftToRight;
            LeftToRight = LeftToRight * nums[i];
        }

        int RightToLeft = 1;
        for(int j = nums.length-1; j >=0; j--)
        {
            myResult[j] = myResult[j] * RightToLeft;
            RightToLeft = RightToLeft * nums[j];
        }

        return myResult;
    }
}