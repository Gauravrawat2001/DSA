// leetcode
// time -> coins.length   , Space -> constant
// Greedy will fail on leetcode because will have to check all possible cases 
class Solution {
    public int coinChange(int[] coins, int amount) {
        int change  = 0;
        Arrays.sort(coins);

        for(int i = coins.length - 1; i >= 0; i--){
            int count = (amount / coins[i]);
            change += count;
            amount -= (coins[i] * count);
        } 
        
        if(amount > 0) return -1;
        return change;
    }
}

// DP code
// time -> , space -> 