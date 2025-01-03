class Solution {
    public int maxProfit(int[] prices) {
        int sellingDay = 1;
        int buyingDay = 0;
        int currProfit, maxProfit = 0;
        while(sellingDay < prices.length)
        {
            currProfit = prices[sellingDay] - prices[buyingDay];
            if(prices[buyingDay] > prices[sellingDay])
            {
                buyingDay = sellingDay;
            }

             maxProfit = Math.max(maxProfit, currProfit);
             sellingDay++;
        }
        

        return maxProfit;
    }
}