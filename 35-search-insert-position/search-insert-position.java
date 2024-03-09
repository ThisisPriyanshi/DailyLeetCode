class Solution {
    public int searchInsert(int[] nums, int target) {
        //sorted array looking for a target and complexity has to be O(LOG N) so we use binary Search

        int start = 0;
        int end = nums.length-1;
        while( start <= end)
        {
            int mid = start + (end - start)/2;
             if(target == nums[mid])
             return mid;
             else if ( nums[mid] < target)
             {
                 start = mid+1;
             }
             else
             {
                 end = mid-1;
             }
        }
        
        return start;
    }
}