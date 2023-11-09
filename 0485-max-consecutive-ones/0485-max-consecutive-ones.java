class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; 
        int consecutivecount = 0;
        int i = 0;

        while(i <= nums.length -1)
        {
            if(nums[i] == 1)
            {
                consecutivecount++;
                i++;
            }
            else if ( nums[i] == 0)
            {
                count = Math.max(count, consecutivecount);
                consecutivecount = 0;
                i++;
            }
        }

        count = Math.max(count, consecutivecount);

        return count;
    }
}