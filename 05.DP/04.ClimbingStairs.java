// Recursive approach -> Leetcode , Time -> 2^N , Space - O(N)
class Solution {
    int count;

    public void countStairs(int n){
        if(n == 0){
            count++;
            return;
        }
        if(n > 0){
        countStairs(n - 1);
        countStairs(n - 2);
        }
    }

    public int climbStairs(int n) {
        count = 0;
        countStairs(n);
        return count;
    }
}
 
// Recursive memo - Time -> O(n), Sapce -> O(n) , top to down
class Solution {

    public int memo(int src , int dest , int[] dp){
        if(src > dest) return 0;
        if(src == dest) return 1;
        if(dp[src] !=0) return dp[src];

        int x = memo(src + 1, dest , dp);
        int y = memo(src + 2, dest , dp);

        return dp[src] = x + y;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n + 5];
        return memo(0 , n , dp);
    }
}

// Tabulation - Time - O(N) , Space -> O(n) , down to top approach
public int tabu(int dest , int[] dp){
    dp[dest] = 1;

    for(int src = dest - 1; src >= 0; src--){
        dp[src] = dp[src + 1] + dp[src + 2];
    }

    return dp[0];
}
public int climbStairs(int n) {
    int[] dp = new int[n + 5];
    // return memo(0 , n , dp);
    return tabu(n , dp);
}

// tabulation Space optimization
// time - O(n) , Sapce - O(1);
class Solution {

    public int tabuOptimization(int dest){
        int ptr1 = 1 , ptr2 = 1 , ptr3 = 0;
        //dp[dest - 1], dp[dest], dp[dest + 1];
        for(int idx = dest - 1; idx >= 0; idx--){
            ptr1 = ptr2 + ptr3;
            ptr3 = ptr2;
            ptr2 = ptr1;
        }

        return ptr1;
    }
    public int climbStairs(int n) {
        return tabuOptimization(n);
    }
}


