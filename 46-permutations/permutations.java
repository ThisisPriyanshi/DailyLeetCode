class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];

        findPermutations(nums, finalList, ds, freq);
        return finalList;
    }

    private void findPermutations(int[] nums, List<List<Integer>> ans, List<Integer> permutation, boolean[] taken)
    {
        //base statement
        if(permutation.size() == nums.length)
        {
            ans.add(new ArrayList<>(permutation));
            return;
        }
        for(int i = 0 ; i < nums.length; i++)
        {
            if(!taken[i])
            {
                taken[i] = true;
                permutation.add(nums[i]);
                findPermutations(nums, ans, permutation, taken);
                taken[i] = false;
                permutation.remove(permutation.size()-1);
            }
        }
    }
}