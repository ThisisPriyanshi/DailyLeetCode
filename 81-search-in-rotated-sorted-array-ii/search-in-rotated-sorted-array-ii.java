class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high)
        {
            int mid = (low+high)/2;

            if(nums[mid] == target)
            return true;

            //check for duplicates due to repeated elements and one pivot

            if((nums[low] == nums[mid]) && (nums[mid] == nums[high]))
            {
                low = low + 1;
                high = high - 1;
                continue;
            }

            if(nums[low] <= nums[mid])
            {
                //left side is sorted
                if((nums[low] <= target) && (target <= nums[mid]))
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1;
                }
            }
            else //right side is sorted
            {
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

        return false;
    }
}