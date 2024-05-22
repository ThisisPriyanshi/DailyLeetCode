class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> mySubset = new ArrayList<>();

        Arrays.sort(nums);
        helper(nums, 0, mySubset, ans);

        return ans;
    }

    public void helper(int[] arr, int i , List<Integer> subset, List<List<Integer>> result)
    {
    //base condition
    if(i == arr.length)
    {
        result.add(new ArrayList<>(subset));
        return;
    }

    //pick the element
    subset.add(arr[i]);

    //call function
    helper(arr, i+1, subset, result);

    //backtrack
    subset.remove(subset.size() - 1);

    //now also ignore duplicates
    while( (i < arr.length - 1) && (arr[i] == arr[i+1]))
    {
        i++;
    }
    //now ignore element and call
    helper(arr, i+1, subset, result);
    return;
    }
}