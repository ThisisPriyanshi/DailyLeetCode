class Solution {
    public int[] searchRange(int[] nums, int target) {
        boolean firstOccurrence = true;
        int[] ans = {-1, -1};

        ans[0] = findPosition(nums, target, firstOccurrence);
        firstOccurrence = false;
        ans[1] = findPosition(nums, target, firstOccurrence);

        return ans;
    }

    public int findPosition(int[] numsArray, int find, boolean first)
    {
        int start = 0;
        int end = numsArray.length - 1;
        int posans = -1;

        while(start <= end)
        {   
            int mid = start + (end-start)/2;
            if (numsArray[mid] < find)
            {
                start = mid+1;
            }
            else if (numsArray[mid] > find)
            {
                end = mid-1;
            }
            else
            {   
                posans = mid;
                if(first == true)
                {
                    end = mid - 1; 
                }
                else
                {
                    start = mid + 1;
                }
            }
        }

        return posans;
    }
}