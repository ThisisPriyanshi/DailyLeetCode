class Solution {
    public int[] rearrangeArray(int[] nums) {
        
int[] result = new int[nums.length];
        int i = 0;
        int j = 1;
        for(int num : nums) {
            // 1. fill positive integers
            if(num >= 0) {
                result[i] = num;
                i += 2;
            }
            // 2. fill negative integers
            else {
                result[j] = num;
                j += 2;
            }
        }
        return result;
    }
}