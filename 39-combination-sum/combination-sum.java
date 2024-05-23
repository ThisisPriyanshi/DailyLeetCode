class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int sumTillNow = 0;

        helper(candidates, 0, target, sumTillNow, subset, result);

        return result;
    }

    public void helper(int[] arr, int i, int target, int sum, List<Integer> subset, List<List<Integer>> result)
    {
        //base statements

        if(sum == target)
        {
        result.add(new ArrayList<>(subset));
        return;
        }

        if(i >= arr.length)
        {
            return;
        }

        if(sum > target)
        {
            return;
        }

        //skip the elememt
        helper(arr, i+1, target, sum, subset, result);

        //include the element
        sum += arr[i];

        subset.add(arr[i]);

        //we stay at this i only even after including because we can take it multiple times
        helper(arr, i, target, sum, subset, result);

        //backtrack and remove

        sum -= arr[i];
        subset.remove(subset.size()-1);

        return;
    }
}