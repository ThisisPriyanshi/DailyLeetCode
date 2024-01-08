class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0 ; i < nums.length;i++)
        {
            int n = arr.size();
            if(i!=0 && nums[i]== nums[i-1])
            {
                start = end+1;
            }
            end = arr.size()-1;

            for(int j = 0 ; j < n;j++)
            {
                List<Integer> arr1 = new ArrayList<>(arr.get(j));
                arr1.add(nums[i]);
                arr.add(arr1);
            }
        }
        return arr;
    }
}
