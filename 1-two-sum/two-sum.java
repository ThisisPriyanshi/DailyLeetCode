class Solution {
    public int[] twoSum(int[] nums, int target) {
int[] result = {-1, -1};
        int l = nums.length; int flag = 0;
        for( int i = 0;i< l ; i++)
        {
            int start = (i+1);
            for(int j = start; j<l; j++)
            {
                int sum = nums[i] + nums[j];
                if (sum == target)
                {
                   result = new int[] {i, j};
                   return result;

                }
        }
    }

    return result;
}
}