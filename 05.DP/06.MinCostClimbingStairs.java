// Leetcode - 746
// Recursive Code - Time -> O(2^N) , Space - O(N);
class Solution {

    public int rec(int src , int dest , int[] cost){
        if(src == dest){
            return 0;
        }
        if(src > dest){
            return Integer.MAX_VALUE;
        }

        int x = rec(src + 1, dest , cost);
        int y = rec(src + 2, dest , cost);

        return Math.min(x , y) + cost[src];
    }
    public int minCostClimbingStairs(int[] cost) {
        int x = rec(0 , cost.length, cost);
        int y = rec(1 , cost.length, cost);

        return Math.min(x,y);
    }
}

// Recursivr memoization ,  Time -> O(N) , Sapce -O(N);


