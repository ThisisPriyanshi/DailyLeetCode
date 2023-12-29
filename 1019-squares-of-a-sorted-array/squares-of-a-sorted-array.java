class Solution {
    public int[] sortedSquares(int[] nums) {
        //using two pointer method

        int leftPtr = 0;
        int rightPtr = nums.length - 1;
        int index = nums.length - 1;

        int[] result = new int[nums.length];

        while(leftPtr <= rightPtr)
        {
            if ( (Math.abs(nums[leftPtr]) < Math.abs(nums[rightPtr])))
            {
                result[index] = nums[rightPtr] * nums[rightPtr];
                rightPtr--;
            }
            else
            {
                result[index] = nums[leftPtr] * nums[leftPtr];
                leftPtr++;
            }

            index--;
        }
    return result;
    }
}