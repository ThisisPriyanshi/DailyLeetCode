class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0; 
        for( int w : weights)
        {
            high = high + w;
            low = Math.max(low, w);
        }

        while(low <= high)
        {
            int mid = (low+ high) / 2;
            int currentDays = daysRequired(weights, mid);
            if(currentDays <= days)
            {
                high = mid - 1;
            }
            else 
            {
                low = mid + 1;
            }
        }

        return low;
    }

    public int daysRequired(int[] weights, int capacity)
    {
        int days = 1;
        int load = 0;

        for(int i = 0; i < weights.length; i++)
        {
            if( (load + weights[i]) > capacity)
            {
                days++;
                load = weights[i];
            }
            else
            {
                load = load + weights[i];
            }
        }

        return days;
    }
}