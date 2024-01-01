class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> myList = new ArrayList<>();

        Arrays.sort(nums);
        int sum = 0;

        for(int i = 0; i < nums.length ; i++)
        {
            if((i > 0) && ( nums[i] == nums[i-1]))
            {
                continue;
            }

            int j = i+1;
            int k = nums.length - 1;

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
                    List<Integer> myTempList = new ArrayList<>();
                    myTempList.add(nums[i]);
                    myTempList.add(nums[j]);
                    myTempList.add(nums[k]);

                    myList.add(myTempList);
                    j++;
                    k--;

                    while(j<k && nums[j] == nums[j-1])
                    {
                        j++;
                    }

                    while(j<k && nums[k] == nums[k+1])
                    {
                        k--;
                    }
                }
            }

        }

        return myList;
    }
}