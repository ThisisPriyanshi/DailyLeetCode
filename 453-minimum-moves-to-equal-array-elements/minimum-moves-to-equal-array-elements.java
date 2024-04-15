class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int ele : nums)
        {
            min = Math.min(min, ele);
        }
        //found the minimum number
        int moves = 0;
        for(int ele : nums)
        {
            moves += ele - min;
        }

        return moves;
    }
}