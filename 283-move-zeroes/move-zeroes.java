class Solution {
    public void moveZeroes(int[] nums) {

        //not optimized but simple for beiginners
        // int countZero = 0;
        // //we maintain a zerocounter and do changes accordingly
        // for(int i = 0; i<nums.length ; i++)
        // {
        //     if(nums[i] == 0)
        //     {
        //         countZero++;
        //     }
        //     else if(countZero>0)
        //     {
        //         int t = nums[i];
        //         nums[i] = 0;
        //         nums[i-countZero] = t;
        //     }
        // }


        //optimized two pointer
        int readptr = 0;
        int writeptr = 0;
        while(readptr < nums.length)
        {
            if(nums[readptr] != 0)
            {
                nums[writeptr] = nums[readptr];
                writeptr++;
            }

            readptr++;
        }

        while(writeptr < nums.length)
        {
            nums[writeptr] = 0;
            writeptr++;
        }

        //System.out.println(Arrays.toString(nums));
        
    }
}