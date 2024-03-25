class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
                int correctindex = nums[i] - 1;
                if (nums[i] != nums[correctindex]) {
                    swap(nums, i, correctindex);
                } else {
                i++;
            } 
        }

        List<Integer> missingList = new ArrayList<>();

        for (int index = 0; index< nums.length; index++)
        {
            if( nums[index] != index+1){
                missingList.add(nums[index]);
            }
        }
         return missingList;
        }

    public void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}