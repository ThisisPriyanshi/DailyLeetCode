class Solution {
    public void sortColors(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements
        // are sorted
        while (mid <= hi) {
            switch (nums[mid]) {
                // If the element is 0
            case 0: {
                temp = nums[lo];
                nums[lo] = nums[mid];
                nums[mid] = temp;
                lo++;
                mid++;
                break;
            }
                // If the element is 1
            case 1:
                mid++;
                break;
                // If the element is 2
            case 2: {
                temp = nums[mid];
                nums[mid] = nums[hi];
                nums[hi] = temp;
                hi--;
                break;
            }
            }
        }
    }
}