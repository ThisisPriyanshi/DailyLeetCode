class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        Arrays.sort(nums); //sorting the array to avoid duplicates

        List<List<Integer>> myList = new ArrayList<>();
        myList.add(new ArrayList<>()); //added an empty subset

        for(int num : nums)
        {
            int n = myList.size();
            for(int i = 0; i < n; i++)
            {
                //making the new subsets by including the previous subset
                List<Integer> mySubList = new ArrayList<>(myList.get(i));
                mySubList.add(num);
                myList.add(mySubList);
            }
        }

        return myList;        
    }
}