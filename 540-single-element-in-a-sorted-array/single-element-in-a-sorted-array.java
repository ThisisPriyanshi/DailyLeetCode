class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while(low < high)
        {
            int mid = low + (high - low)/2;

            if(mid % 2 != 0) //if not even set it to even
            {
                mid--;
            }

            if(nums[mid] == nums[mid+1])
            {
                low = mid + 2; //next number
            }
            else // the single number exists on the left side
            {
                high = mid;
            }
        }

        return nums[low];
    }
}