class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int n : nums)
        {
            int outerSize = outer.size();
            for(int i = 0; i < outerSize; i++)
            {
                List<Integer> inner = new ArrayList<Integer>(outer.get(i));
                inner.add(n);
                outer.add(inner);
            }
        }

        return outer;
    }
}