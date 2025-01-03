class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int num2 = target - nums[i];
            if( myMap.containsKey(num2))
            {
                return new int[]{i, myMap.get(num2)};
            }
            else
            {
            myMap.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}