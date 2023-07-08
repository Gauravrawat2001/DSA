
// time -> 2^n , Space -> O(N), LC -> 509
class Solution {

    public int rec(int n){
        if(n <= 1) return n;

        return rec(n - 1) + rec(n -2);
    }

    public int fib(int n) {
         return rec(n);

    }
}