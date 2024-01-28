class Solution {
    public int findMin(int[] nums) {
        //set low, high, mid, ans
        //find out sorted parted --> first valueof the sorted could be a possible answer
        //check if the other part has the possible answer
        
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while(low <= high)
        {
            int mid = (low + high) / 2;

            //check if array is sorted in itself(not rotated or rotated to original position)
            if(nums[low] < nums[high])
            {
                ans = Math.min(ans, nums[low]);
                break;
            }

            //find out the sroted half and set 
            if(nums[low] <= nums[mid])
            {
                ans = Math.min(ans, nums[low]);
                low = mid+1;
            }
            
            if(nums[mid] <= nums[high])
            {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
}