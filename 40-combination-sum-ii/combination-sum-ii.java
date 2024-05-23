class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates); //duplicate elements
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        int sumTillNow = 0;

        helper(0, candidates, target, sumTillNow, subset, res);

        return res;
    }
    private static void helper(int index, int[] arr, int target, int sum, List<Integer>subset, List<List<Integer>> res)
    {
        //base condition
        if(sum == target)
        {
            res.add(new ArrayList<>(subset));
            return;
        }
        //base condition 2 -
        if(index >= arr.length)
        {
            return;
        }

        //base condition 3
        if(sum > target)
        return;
        
        //pick element
        sum += arr[index];
        subset.add(arr[index]);

        helper(index+1, arr, target, sum, subset, res);

        //backtrack
        sum -= arr[index];
        subset.remove(subset.size()-1);

        //ignore element but also ignore all duplicate existences
        while(index < arr.length - 1 && arr[index] == arr[index+1])
        {
            index++;
        }

        helper(index+1,arr, target,sum, subset, res );

        return;
    }
}