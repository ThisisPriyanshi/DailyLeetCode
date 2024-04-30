class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //same as subsets problem with slight modification

        //we need all duplicate elements to be adjacent so we first sort the given array
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        //now we take wo pointers start and end to mark which elements to be picked
        int start = 0;
        int end = 0;
        //since not all elements are to be picked we use for loop
        for(int i = 0; i < nums.length; i++)
        {
            start = 0;
            //but if there is usplicates the new start will end+1
            if( i > 0 && (nums[i] == nums[i-1]))
            {
                start = end + 1;
            }
            end = outer.size()-1;

            int oSize = outer.size();
            for(int j = start; j < oSize; j++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }

        }

        return outer;
    }
}