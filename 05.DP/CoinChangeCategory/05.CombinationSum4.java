// LeetCode
// Time - > O(amount * coin), Space - O(amount)
// recusrive memoization solution

class Solution {

    public int perm(int amount, int[] coins ,  int[] dp){
            if(amount == 0) return 1;
            if(amount < 0) return 0;

            if(dp[amount] != -1) return dp[amount];
            
            int ans = 0;
            for(int idx = 0; idx < coins.length; idx++){
                if(coins[idx] > amount) continue;
                ans += perm(amount - coins[idx], coins ,  dp);
            }
          return dp[amount] = ans ; 
    }
    public int combinationSum4(int[] coins, int amount) {
        int[] dp = new int[amount + 5];
        Arrays.fill(dp , -1);

        return perm(amount , coins , dp);
    }
}

// Tabulation 
// time -> O(amount * coins.length), Space - O(amount);
class Solution {
    public int combinationSum4(int[] coins, int amount) {
        int[] dp = new int[amount + 5];
        dp[0] = 1; // empty array // to make sum 0 we have 1 way;
        
        for(int currAmount = 1; currAmount <= amount; currAmount++){
             for(int c : coins){
            
                if(c > currAmount) continue;;
                dp[currAmount] += dp[currAmount - c];
            }
        }

        return dp[amount];
    }
}
