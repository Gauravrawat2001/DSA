// Tabulation // two pointer solution //Space optimization 
// time -> O(N) , Space -> Constannt 
class tab2 {

    public int tab(int n){
        if(n <= 1) return n;
       int a = 0 ; int b = 1;
       int c = 0;
       for(int idx = 1; idx < n; idx++){
           c = a + b;
           a = b;
           b = c;
        }

        return c;
    }
    public int fib(int n) {
        return tab(n);
    }
}


// Tabulation // bottom to top approach // iterative Dp
// ime - > O(N) , Space - O(n)

class Tab{

    public int tab(int n ,  int[] dp){
        if(n <= 1) return n;
     
        dp[0] = 0 ; dp[1] = 1;

       for(int idx = 2; idx <= n; idx++){
           dp[idx] = dp[idx - 1] + dp[idx - 2];
       }
        return dp[n];
    }
    public int fib(int n) {
        int[] dp = new int[n + 1];
        return tab(n , dp);
    }
}


// memoization / top to down approach / recursive Dp
// time ->O(N) , Space - O(N)

class Memo {

    public int memo(int n ,  int[] dp){
        if(n <= 1) return n;
        
        if(dp[n] != 0) return dp[n];

        int fib1 = memo(n - 1, dp);
       int fib2 =  memo(n - 2 , dp);
        
        dp[n] = fib1 + fib2;
        return dp[n];
    }
    public int fib(int n) {
        int[] dp = new int[n + 1];
        return memo(n , dp);
    }
}

// Recursive solution , time - exponential(approx 2^n), Space - recursive stackO(n)
class Solution {

    public int rec(int n){
        if(n <= 1) return n;

        return rec(n - 1) + rec(n -2);
    }

    public int fib(int n) {
         return rec(n);

    }
}