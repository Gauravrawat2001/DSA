//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java
// Time -> (type of coins + amount) 
class Solution{
    static List<Integer> minPartition(int amount)
    {
        // code here
        List<Integer> change = new ArrayList<>();
        
        int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        
        for(int idx = coins.length - 1; idx >= 0; idx--){
            while(amount >= coins[idx]){
                change.add(coins[idx]);
                amount -= coins[idx];
            }
        }
        
        return change;
    }
}
