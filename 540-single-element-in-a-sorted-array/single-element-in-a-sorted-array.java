class Solution {
    public int singleNonDuplicate(int[] nums) {

 
        int start = 0;
        int end = nums.length - 1;

        while(start < end)
        {
            int mid = start + (end - start)/2;

            if(mid % 2 != 0)
            {
                mid--;// put it even position for checking
            }

            if(nums[mid] == nums[mid+1])//correct position that means single element is on right side
            {
                start = mid + 2; //next number
            }
            else //incorrect positioning that means single number is on the left side
            {
                end = mid;
            }
        }

        return nums[start];
    }
}