// LeetCode 
// Greedy , Time -> O(prices.length) , Space - O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int buying = (int)1e7;
        int profit = 0;

        for(int selling : prices){
            buying = Math.min(buying , selling);
            profit = Math.max(profit, selling - buying);
        }

        return profit;
    }
}