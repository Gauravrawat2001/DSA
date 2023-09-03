// Leetcode
// Space - O(amount * coins.length), Time -> O(amount * coins * coins)
// memoization 
class Solution {

    public int comb(int amount, int last , int[]coins, int[][] dp){
            if(amount == 0) return 1;
            if(amount < 0) return 0;

            if(dp[amount][last] != -1) return dp[amount][last];
            
            int ans = 0;
            for(int idx = last; idx < coins.length; idx++){
                if(coins[idx] > amount) continue;
                ans += comb(amount - coins[idx], idx , coins , dp);
            }
          return dp[amount][last] = ans ; 
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount + 5][coins.length + 5];
          for(int r = 0; r < dp.length; r++){
              for(int c = 0; c < dp[0].length; c++){
                  dp[r][c] = -1;
              }
          }

          return comb(amount , 0 , coins , dp);
  }
}

// Tabulation 
// time -> O(amount * coins.length), Space - O(amount);
class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 5];
        dp[0] = 1; // empty array // to make sum 0 we have 1 way;

        for(int c : coins){
            for(int currAmount = 1; currAmount <= amount; currAmount++){
                if(c > currAmount) continue;;
                dp[currAmount] += dp[currAmount - c];
            }
        }

        return dp[amount];
    }
}