class Solution {
    public int majorityElement(int[] nums) {
        
        int boyMooreElement = 0;
        int boyMooreCount = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(boyMooreCount == 0)
            {
                boyMooreElement = nums[i];
            }
            if (nums[i] == boyMooreElement)
            {
                boyMooreCount++;
            }
            else
            {
                boyMooreCount--;
            }
        }
        return boyMooreElement;
    }
}