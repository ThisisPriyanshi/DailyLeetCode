class Solution {
    public int maxProduct(int[] nums) {
        //we will use the kadane's algorithm but modified

        int maxProduct = Integer.MIN_VALUE;

        //calculating from left to right

        int leftToRightProduct = 1;

        for(int i = 0 ; i <nums.length; i++)
        {
            leftToRightProduct = leftToRightProduct * nums[i];
            maxProduct = Math.max(maxProduct, leftToRightProduct);

            if (leftToRightProduct == 0)
            leftToRightProduct = 1;
        }

        //calculating from right to left

        int rightToLeftProduct = 1;

        for(int j = nums.length - 1; j >= 0; j--)
        {
            rightToLeftProduct = rightToLeftProduct * nums[j];
            maxProduct = Math.max(maxProduct, rightToLeftProduct);

            if(rightToLeftProduct == 0)
            rightToLeftProduct = 1;
        }

        return maxProduct;
    }
}