class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        //added empty subset

        for(int n : nums)
        {
            int oSize = outer.size();
            for(int i = 0; i < oSize; i++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(n);
                outer.add(internal);
            }
        }
        
        return outer;
    }
}