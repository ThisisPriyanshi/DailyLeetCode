class Solution {
    public int removeDuplicates(int[] nums) {
        int readPtr = 0;
        int uniquePtr = 0;

        int len = nums.length;

        while(readPtr < nums.length)
        {
            if(nums[uniquePtr] == nums[readPtr])
            {
                readPtr++;
            }
            else
            {
                nums[uniquePtr+1] = nums[readPtr];
                uniquePtr++;
            }
        }

        return uniquePtr+1;
    }
}