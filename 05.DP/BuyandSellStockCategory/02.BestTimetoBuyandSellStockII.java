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