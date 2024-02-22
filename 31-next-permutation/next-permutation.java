class Solution {
    public void nextPermutation(int[] nums) {
        int breakPointIndex = -1;
        int n = nums.length;

        //finding out breakpoint
        for(int i = n-2; i >= 0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                breakPointIndex = i;
                break;
            }
        }

        if(breakPointIndex == -1)
        {
            //last permutation so we need the first permutation --> simply reverse     
            int j = nums.length - 1;
            for(int i = 0; i < n/2; i++)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;            
            }
        }
        else
        {
            //find the smallest integer greater than the breakpoint integer
            for(int i = nums.length - 1; i >= breakPointIndex ; i--)
            {
                if(nums[i] > nums[breakPointIndex])
                {
                    int temp = nums[i];
                    nums[i] = nums[breakPointIndex];
                    nums[breakPointIndex] =temp;
                    break;
                }
            }
        }

        //arrange the permutation
        Arrays.sort(nums, breakPointIndex+1, n);
    }
}