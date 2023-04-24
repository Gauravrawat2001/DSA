// GFG time -> O(n) , Space -> O(1);

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

 class GFG {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while(T>0)
            {
                int N = sc.nextInt();
                int arr[] = new int[N];
                for(int i=0; i<N; i++)
                    arr[i] = sc.nextInt();
                
                Solution g = new Solution();
                long ans = g.wineSelling(arr,N);
                
                System.out.println(ans);
                T--;
            }
        }
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution {
    long wineSelling(int arr[],int N){
        // code here
        long work = 0l;
        int buy = 0, sell = 0;
        
        while(true){
            while(buy < N && arr[buy] <= 0) buy++;
            while(sell < N && arr[sell] >= 0) sell++;
            if(buy == N || sell == N) break;
            
            long wines = Math.min(-arr[sell], arr[buy]);
            long dist = Math.abs(sell - buy);
            
            work += wines * dist;
            
            arr[sell] += (int)wines;
            arr[buy] -= (int)wines;
        }
        
        return work;
    }
}

//{ Driver Code Starts.
// } Driver Code Ends