class Solution {
    public int maxFrequencyElements(int[] nums) {
        int result = 0;
        int freq[] = new int[100];
        int maxFreq= 0;
        for(int i = 0; i < nums.length; i++)
        {
            int comp = nums[i];
            int currFrequency = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if ( comp == nums[j])
                currFrequency++;
            }
            freq[comp-1] = currFrequency;
            maxFreq = Math.max(currFrequency, maxFreq);
        }

        for(int k = 0; k < 100; k++)
        {
            if (freq[k] == maxFreq)
            result += freq[k];
        }

        return result;
    }
}