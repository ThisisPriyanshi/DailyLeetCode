class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int l = prices.length;
        int profit = 0; int currProfit = 0;
        for(int i = 0; i < l; i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }

            currProfit = prices[i] - min;
            profit = Math.max(profit, currProfit);

        }

        return profit;
    }
}