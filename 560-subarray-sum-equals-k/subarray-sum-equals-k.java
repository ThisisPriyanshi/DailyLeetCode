class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        int[] prefixSum = new int[nums.length+1];
        prefixSum[0] = 0;

        for(int i = 1; i <= nums.length; i++)
        {
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }

        for(int start = 0; start < prefixSum.length; start++)
        {
            for(int end = start+1; end< prefixSum.length; end++)
            {
                if( (prefixSum[end] - prefixSum[start]) == k)
                count++;
            }
        }

        return count;
    }
}


