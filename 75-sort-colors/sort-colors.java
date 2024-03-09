class Solution {
    public void sortColors(int[] nums) {
        
        int leftP = 0;
        int endP = nums.length -1;
        int traverse = 0;

        while(traverse <= endP)
        {
            if(nums[traverse] == 0)
            {
                int temp = nums[leftP];
                nums[leftP] = nums[traverse];
                nums[traverse] = temp;
                leftP++; 
                traverse++;
            }
            else if (nums[traverse] == 1)
            {
                traverse++;
            }
            else if (nums[traverse] == 2)
            {
                int temp = nums[endP];
                nums[endP] = nums[traverse];
                nums[traverse] = temp;
                endP--;
            }
        }
    }
}