class Solution {
    public void nextPermutation(int[] nums) {
        //Step 1 - find the breakpoint index
        int breakpoint = -1;

        for(int i = nums.length-2; i >= 0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                breakpoint = i;
                break;
            }
        }

        //step 2 - if breakpoint is not found then tat means that we are at the last permutation so we just need to reverse our array and return
        if(breakpoint == -1)
        {
            int j = nums.length - 1;
            for(int i = 0; i < nums.length/2; i++)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j--;
            }
        }
        else
        {
            //we have a breakpoint then that means we will have to form a permutation - we look to find the smallest larger number than our breakpoint number
            for(int j = nums.length - 1; j >= breakpoint; j--)
            {
                if(nums[j] > nums[breakpoint])
                {
                    int temp = nums[j];
                    nums[j] = nums[breakpoint];
                    nums[breakpoint] = temp;

                    break;
                }
            }

            //form our permutation
            Arrays.sort(nums, breakpoint + 1, nums.length);
        }

    }
}