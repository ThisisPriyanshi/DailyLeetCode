class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();

        findPermutations(nums, permutation, finalList);
        return finalList;
    }

    private void findPermutations(int[] nums, List<Integer> makePermutation, List<List<Integer>> allPermutations)
    {
        //base statement
        if (makePermutation.size() == nums.length)
        {
            allPermutations.add(new ArrayList<>(makePermutation));
        }
        else
        {
        for(int i = 0; i < nums.length; i++)
        {
            if(makePermutation.contains(nums[i]))
            continue;

            makePermutation.add(nums[i]);
            findPermutations(nums, makePermutation, allPermutations);
            makePermutation.remove(makePermutation.size()-1); //removing last element
        }
    }
    }
}