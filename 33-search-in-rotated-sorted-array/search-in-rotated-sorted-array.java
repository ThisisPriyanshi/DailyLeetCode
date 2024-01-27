class Solution {
    public int search(int[] nums, int target) {
        //step 1 - set low, high, mid.
        //step 2 - find the sorted side 
        //step 3 - check if the sorted side has the target
        //step 4 - change low high accordingly.

        int low = 0;
        int high = nums.length-1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            //check if mid is target
            if(nums[mid] == target)
            {
                return mid;
            }
            //find sorted half
            //check if left-half is sorted
            if (nums[low] <= nums[mid])
            {
                //check if target lies there
                if( (nums[low] <= target) && ( target <= nums[mid]))
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                //if right part is sorted
                if((nums[mid] <= target) && (target <= nums[high]))
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        return -1; 
    }
}