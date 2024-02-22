class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;
        int posIndex = 0, negIndex = 0;
        int[] result = new int[n];

        // Place positive numbers at even indices and negative numbers at odd indices
        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) {
                while (posIndex < n && nums[posIndex] < 0)
                    ++posIndex;
                result[i] = nums[posIndex++];
            } else {
                while (negIndex < n && nums[negIndex] >= 0)
                    ++negIndex;
                result[i] = nums[negIndex++];
            }
        }
        return result;
    }
}