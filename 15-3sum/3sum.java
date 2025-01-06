class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> myList = new ArrayList<>();

        //we sort the array so we can find the numbers  easily 
        Arrays.sort(nums);
        int sum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            //start the loop and step 1 is setting i
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            //i is set

            int j = i+1;
            int k = nums.length - 1;

            //set j
            while(j < k)
            {
                sum = nums[i] + nums[j] + nums[k];

                if(sum < 0)
                {
                    j++;
                }
                else if (sum > 0)
                {
                    k--;
                }
                else
                {
                    List<Integer> myCombination = new ArrayList<>();
                    myCombination.add(nums[i]);
                    myCombination.add(nums[j]);
                    myCombination.add(nums[k]);

                    myList.add(myCombination);
                    k--;
                    j++;

                    //remove duplicates of j and k
                    while(j < k && nums[j] == nums[j-1])
                    j++;

                    while(j < k && nums[k] == nums[k+1])
                    k--;

                }
            }
        }

        return myList;
    }
}