class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> myList = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            if( i > 0 && (nums[i] == nums[i-1]))
            {
                continue;
            } //i value set

            int j = i + 1;
            int k = n - 1;

            while(j < k)
            {
                sum = nums[i] + nums[j] + nums[k];

                //now compare sum

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
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    myList.add(temp); //one combination added
                    j++;
                    k--;

                    //remove duplicates

                    while(j < k && nums[j-1] == nums[j])
                    j++;

                    while(j < k && nums[k] == nums[k+1])
                    k--;
                }
            }
        }

        return myList;
    }
}