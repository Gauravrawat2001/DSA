// Leetcode 
// greedy , Time -> O(n) , Space -> O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int buying = (int)1e7;
        int profit = 0;

        for(int selling : prices){
            if(selling >= buying){
                profit += selling - buying;
            }

            buying = selling;
        }

        return profit;
    }
}

// DP approach - Tabulation space optimized
// Time -> O(N) , Space -> O(1)
//

class Solution {
    public int maxProfit(int[] prices) {
        int buy = -prices[0] , sell = 0;

        for(int i = 0; i < prices.length; i++){
            int newbuy = Math.max(buy , sell - prices[i]);
            int newsell = Math.max(sell , buy + prices[i]);
            buy = newbuy; sell = newsell;
        }

        return sell;
    }
}