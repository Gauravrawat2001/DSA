package HashMap;

// GFG

//{ Driver Code Starts
//Initial Template for Java










//User function Template for Java


class Solution {
    int maxRepeating(int[] nums, int n, int k) {
        // code here
        // Visited Mark
        for(int i = 0; i < n; i++){
            int val = nums[i] % (n + 1);
            nums[val] += (n + 1);
        }
        
        // Finding Max frequency Value
        int maxfreq = 0 , value = 0;
        for(int i = 0; i < n; i++){
            int freq = nums[i] / (n + 1);
            if(freq > maxfreq){
                maxfreq = freq;
                value = i;
            }
        }
        
        return value;
    }
}
