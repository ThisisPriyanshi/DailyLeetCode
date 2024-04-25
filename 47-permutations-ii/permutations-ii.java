class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] isUsed = new boolean[nums.length];
        List<List<Integer>> list = new ArrayList<>();
        permute(nums, list, isUsed, new ArrayList<>());
        return list;
    }

    private void permute(int[] nums, List<List<Integer>> list, boolean[] isUsed, List<Integer> item) {
        if (item.size() == nums.length) {
            list.add(new ArrayList<>(item));
            return;
        }
        
        int lastRemoved = 99;
        for (int i = 0; i < nums.length; i++) {
            if (!isUsed[i] && nums[i] != lastRemoved) {
                item.add(nums[i]);
                isUsed[i] = true;

                permute(nums, list, isUsed, item);

                lastRemoved = item.remove(item.size() - 1);
                isUsed[i] = false;
            }
        }
    }
}
