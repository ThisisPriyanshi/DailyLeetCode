class Solution {
    public void moveZeroes(int[] nums) {
        //using two pointers

        int read = 0;
        int write = 0;

        while(read < nums.length)
        {
            if(nums[read] != 0)
            {
                nums[write] = nums[read];
                write++;
            }

            read++;
        }

        while(write < nums.length)
        {
            nums[write] = 0;
            write++;
        }
    }
}