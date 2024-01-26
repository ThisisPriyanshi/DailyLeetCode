class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int temp = 0;

        while(mid <= high)
        {
            switch (nums[mid])
            {   
                //if element is 0
                case 0 :
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
                break;

                //if element is 1
                case 1 :
                mid++;
                break;

                //if element is 2
                case 2 :
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
                break;

            }
        }
    }
}