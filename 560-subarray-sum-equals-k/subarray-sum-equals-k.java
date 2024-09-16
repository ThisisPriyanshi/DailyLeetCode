class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer, Integer> prevSumMap = new HashMap<>();

        //we put prevSum for first 
        prevSumMap.put(0,1);

        int currSum = 0;
        int subarrayCount = 0;

        for(int i = 0; i < nums.length; i++)
        {
            currSum += nums[i];
            int remaining = currSum - k;

            if(prevSumMap.containsKey(remaining))
            {
                subarrayCount += prevSumMap.get(remaining);
            }

            //update the map count
            prevSumMap.put(currSum, prevSumMap.getOrDefault(currSum,0)+1);
        }

        return subarrayCount;
    }
}