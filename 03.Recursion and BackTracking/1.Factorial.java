

// Time -> O(n), GFG , Space -> O(1), stack space -> O(N)
class Solution{
    static long factorial(int N){
        // code here
        if(N == 0) return 1;
        long sans = factorial(N - 1);
        long bans = N * sans;
        return bans;
    }
}
