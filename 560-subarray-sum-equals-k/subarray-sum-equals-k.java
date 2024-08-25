class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> prevSumMap = new HashMap<>();
        //adding prevSum to this map
        prevSumMap.put(0,1); //adding previous sum as 0
        int currSum = 0;
        int subArrayCount = 0;
        for(int i = 0; i < nums.length; i++)
        {
            currSum += nums[i];

            int remaining = currSum - k; //check out diff in target

            if(prevSumMap.containsKey(remaining))
            {
                subArrayCount += prevSumMap.get(remaining);
            }
                prevSumMap.put(currSum, prevSumMap.getOrDefault(currSum,0)+1);
        }

        return subArrayCount;
    }
}