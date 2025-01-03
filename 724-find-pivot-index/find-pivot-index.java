class Solution {
    public int pivotIndex(int[] nums) {
        int totSum = 0;
        int leftSum = 0;

        for(int ele : nums)
         totSum += ele;

         for(int i = 0; i < nums.length; i++)
         {
            if(leftSum * 2 == totSum - nums[i])
            {
            return i;
            }
            else
            leftSum += nums[i];
         }

         return -1;
    }
}