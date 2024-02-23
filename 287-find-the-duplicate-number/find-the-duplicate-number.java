class Solution {
    public int findDuplicate(int[] nums) {
        
        int i = 0;
        while(i < nums.length)
        {
            int correctIndex = nums[i] - 1;

            if(nums[correctIndex] != nums[i])
            {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else
            {
                i++;
            }
        }

        return nums[nums.length-1];
        
    }
}