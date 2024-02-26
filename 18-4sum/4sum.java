class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();

        //Sort the array first
        Arrays.sort(nums);

        //since we are doing quadruplets we will keep i, j constant while k and l move 

        for(int i = 0; i< nums.length; i++)
        {
            //avoiding duplicates
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            for(int j = (i+1); j < nums.length; j++)
            {
                //avoiding duplicates for j
                if(j > (i+1) && nums[j] == nums[j-1])
                {
                    continue;
                }

                //set up the moving pointers
                int k = j+1;
                int l = nums.length-1;
                while( k < l)
                {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum == target)
                    {
                        List<Integer> quadruplet = new ArrayList<>();
                        quadruplet.add(nums[i]);
                        quadruplet.add(nums[j]);
                        quadruplet.add(nums[k]);
                        quadruplet.add(nums[l]);
                        ans.add(quadruplet);
                        k++;
                        l--;

                    //skip duplicates for k and l
                        while(k < l && nums[k] == nums[ k-1])
                        k++;
                        while(k<l && nums[l]== nums[l+1])
                        l--;
                    }
                    else if(sum < target)
                    {
                        k++;
                    }
                    else
                    {
                        l--;
                    }
                }
            }

        }

        return ans;
    }
}