class Solution {
    public int maxProfit(int[] prices) {
        int minVal = prices[0];

        int currProfit = 0;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            if ( prices[i] < minVal)
            {
                minVal = prices[i];
            }

            currProfit = prices[i] - minVal;
            maxProfit = Math.max(currProfit, maxProfit);
        }

        return maxProfit;
    }
}