class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        
        if(n==0)
        return 0;

        int maxCount = 0;
        int count = 1;

        Arrays.sort(nums);

        for(int i = 1 ; i < nums.length; i++)
        {
            if( nums[i] != nums[i-1])
            {
                if(nums[i-1] == nums[i] - 1)
                {
                    count++;
                }
                else
                {
                    maxCount = Math.max(maxCount, count);
                    count = 1;
                }
            }
        }

        return Math.max(maxCount, count);
    }
}