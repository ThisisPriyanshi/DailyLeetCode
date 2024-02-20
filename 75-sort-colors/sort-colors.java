class Solution {
    public void sortColors(int[] nums) {
        int leftP = 0;
        int endP = nums.length - 1;
        int mid = 0;

        while( mid <= endP )
        {
            if (nums[mid] == 0)
            {
                int temp = nums[leftP];
                nums[leftP] = nums[mid];
                nums[mid] = temp;
                leftP++;
                mid++;
            }

            else if (nums[mid] == 1)
            {
                mid++;
            }

            else if (nums[mid] == 2)
            {   
                int temp2 = nums[endP];
                nums[endP] = nums[mid];
                nums[mid] = temp2;
                endP--;
            }
        }
    }
}