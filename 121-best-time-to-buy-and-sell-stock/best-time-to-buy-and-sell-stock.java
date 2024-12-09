class Solution {
    public int maxProfit(int[] prices) {
        int buyingDay = 0;
        int sellingDay = 1;
        int profit = 0;
        int currProfit = 0;

        while(sellingDay < prices.length)
        {
            if(prices[sellingDay] < prices[buyingDay])
            {
                buyingDay = sellingDay;
            }
            else
            {
                currProfit = prices[sellingDay] - prices[buyingDay];
                profit = Math.max(currProfit, profit);
            }

            sellingDay++;
        }

        return profit;
    }
}