class Solution {
    public int minMoves(int[] nums) 
    {
    Arrays.sort(nums);
    int moves = 0;

    for(int ele : nums)
    {
        moves += Math.abs(nums[0] - ele);
    }
    return moves;
    }
}