class Solution {
    public int[] sortedSquares(int[] nums) {
        int leftP = 0 ;
        int rightP = nums.length - 1;
        int index = nums.length - 1;

        int[] myArr = new int[nums.length];
        
        while(leftP <= rightP)
        {
            if(Math.abs(nums[leftP]) > Math.abs(nums[rightP]))
            {
                myArr[index] = nums[leftP] * nums[leftP];
                leftP++;
            }
            else
            {
                myArr[index] = nums[rightP] * nums[rightP];
                rightP--;
            }

            index--;
        }

        return myArr;
    }
}