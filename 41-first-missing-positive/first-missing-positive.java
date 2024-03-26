class Solution {
    public int firstMissingPositive(int[] nums) {

        int i = 0;
            while(i< nums.length)
            {
                int correctindex = nums[i] - 1;
                if(nums[i]> 0 && nums[i] <= nums.length && nums[i] != nums[correctindex]) {
                    swap(nums, i , correctindex);
                }
                else {
                    i++;
                }
            }
            //search for first missing number
            for (int index = 0; index< nums.length; index++)
            {
                if( nums[index] != index+1){
                    return index +1;
                }
            }
            return nums.length +1 ; // case N is the answer
        }
    public static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
        
    }