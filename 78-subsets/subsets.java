class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> mySubset = new ArrayList<>();
        helper(nums, 0, mySubset, ans);

        return ans;
    }

    public void helper(int[] arr, int currentIndex, List<Integer> subset, List<List<Integer>> result)
    {
        //base condition 
        if(currentIndex == arr.length)
        {
            result.add(new ArrayList<>(subset));
            return;
        }

        //pick up element
        subset.add(arr[currentIndex]);
        helper(arr, currentIndex+1, subset, result);

        //backtrack
        subset.remove(subset.size()-1);

        //dont pick 
        helper(arr, currentIndex+1, subset, result);
        return;
    }
}