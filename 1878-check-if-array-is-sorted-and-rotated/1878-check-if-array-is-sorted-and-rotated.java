class Solution {
    public boolean check(int[] nums) {
        int count = 0; // since its a sorted aray in ascending order we will keep a track of where the array is not in ascending.

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1])
                count++;
        }

        if(count == 0) // if count is zero it means its a sorted array w/o any rotation
            return true;
        else if(count > 1)// if there is more than one point where array is descending that means its not sorted
            return false;
        else if(nums[0] >= nums[nums.length-1]) //id count is one we make sure if its rotated
                return true;
             else 
                return false;
    }
}