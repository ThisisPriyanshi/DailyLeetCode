class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> finalAns = new ArrayList<>();

        getSubsetList(temp, 0, nums, finalAns);
        return finalAns;
    }

    private void getSubsetList(List<Integer> temp, int index, int[] arr, List<List<Integer>> finalAns)
    {
        //base statement
        if(index == arr.length)
        {
            finalAns.add(new ArrayList<>(temp));
            return;
        }

        //pick up the number
        temp.add(arr[index]);
        getSubsetList(temp, index+1, arr, finalAns);

        //ignore the number
        temp.remove(temp.size()-1);
        getSubsetList(temp, index+1, arr, finalAns);
    }
}