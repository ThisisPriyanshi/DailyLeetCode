class Solution {
    public int findDuplicate(int[] nums) {
               int i = 0;
        while(i< nums.length)
        {   
            
            if (nums[i] != i+1)
            {
            int correctindex = nums[i] - 1;
            if(nums[i] != nums[correctindex]) {
                swap(nums, i , correctindex);
            }
            else {
                return nums[i];
            }
            }
            else {
                i++;
            }
        }
        return -1;
        }
        

    public void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
