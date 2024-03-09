class Solution {
    public int findMin(int[] nums) {
        //step 1 - set low, high, mid and a variable ans to store the answer
        //step 2 - check 3 cases --> array is not pivoted, left half is sorted, right half is sorted
        //step 3 - whichever case maybe true --> set values by using Math.min(ans, first element of the case)
        //return ans

        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while(low <= high)
        {
            int mid = (low+high)/2;

            //case 1 - array is sorted, not pivoted
            if(nums[low] < nums[high])
            {
                ans = Math.min(ans, nums[low]);
                break;
            }
            
            //case 2 - left side is sorted
            if(nums[low] <= nums[mid])
            {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            }

            //case 3 - right side sorted
            if(nums[mid] < nums[high])
            {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }

        }
    return ans;
    }
}