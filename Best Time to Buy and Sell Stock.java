class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }
        int lowest = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (lowest > prices[i]) {
                lowest = prices[i];
            }
            if (prices[i] > lowest && prices[i] > lowest) {
                profit = Math.max(profit, prices[i] - lowest);
            }
        }
        return profit;
        
    }
}