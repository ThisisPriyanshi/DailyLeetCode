class Solution {
    public int maxProfit(int[] prices) {
        //using two pointers

        int buyingDay = 0;
        int sellingDay = 1;
        int profit = 0;

        while(sellingDay < prices.length)
        {
            if(prices[buyingDay] > prices[sellingDay])
            {
                buyingDay = sellingDay; //we will uodate our buying day
            }
            else
            {
                int profitCurr = prices[sellingDay] - prices[buyingDay];
                profit = Math.max(profitCurr, profit);
            }

            sellingDay++;
        }
        return profit;
    }
}