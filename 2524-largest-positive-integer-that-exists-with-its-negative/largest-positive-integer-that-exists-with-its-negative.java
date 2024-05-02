class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        if((nums.length == 1) || (nums[0] >= 0) || (nums[nums.length-1] < 0))
            return -1;
        
        List<Integer> myList = new ArrayList<>();
        for( int n : nums)
        {
            myList.add(n);
        }
        int i = 0;
        while(nums[i] < 0)
        {
            if(myList.contains(Math.abs(nums[i])))
            return Math.abs(nums[i]);

            i++;
        }
        
        return -1;
    }
}
