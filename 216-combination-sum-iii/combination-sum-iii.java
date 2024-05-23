class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        int sumTillNow = 0;

        helper(1,n,k, sumTillNow, subset, ans);
        return ans;
    }

    private void helper(int index, int target, int k, int sum, List<Integer> subset, List<List<Integer>> result)
    {   
        
        //base condition
        if((sum == target) && (k == 0))
        {
            result.add(new ArrayList<>(subset));
            return;
        }

        //base condition 2
        if(index > 9)
        {
            return;
        }

        //base condition 3
        if(sum > target)
        {
            return;
        }

        //pick up the element
        sum += index;
        subset.add(index);

        //call recursion
        helper(index+1, target, k-1, sum, subset, result);

        //backtrack
        sum -= index;
        subset.remove(subset.size() - 1);

        //dont pick
        helper(index+1, target, k, sum, subset, result);
        return;
    }
}