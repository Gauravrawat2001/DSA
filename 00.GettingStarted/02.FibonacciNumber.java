// leetcode , time - O(n), Space - constant

class Solution {

    public int tab2(int n){
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
        // int[] dp = new int[n + 1];
        return tab2(n);
    }
}