class Solution {
    public void moveZeroes(int[] nums) {

        int countZero = 0;
        //we maintain a zerocounter and do changes accordingly
        for(int i = 0; i<nums.length ; i++)
        {
            if(nums[i] == 0)
            {
                countZero++;
            }
            else if(countZero>0)
            {
                int t = nums[i];
                nums[i] = 0;
                nums[i-countZero] = t;
            }
        }

        System.out.println(Arrays.toString(nums));
        
    }
}