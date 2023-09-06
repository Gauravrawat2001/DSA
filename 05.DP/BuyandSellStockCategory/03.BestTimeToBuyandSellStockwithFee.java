// DP approach - Tabulation space optimized
// Time -> O(N) , Space -> O(1)
//

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy = -prices[0] , sell = 0;

        for(int i = 0; i < prices.length; i++){
            int newbuy = Math.max(buy , sell - prices[i]);
            int newsell = Math.max(sell , buy + prices[i] - fee);
            buy = newbuy; sell = newsell;
        }

        return sell;
    }
}