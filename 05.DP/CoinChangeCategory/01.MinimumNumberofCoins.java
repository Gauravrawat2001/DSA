// https://practice.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
// GFG // Indian coin change



// User function Template for Java

// time - O(amount * coins.length) , Space = coins.length

class Solution{
    static List<Integer> minPartition(int amount)
    {
        // code here
        List<Integer> change = new ArrayList<>();
        
        int[] coins = {2000 , 500 , 200 , 100 , 50 , 20 , 10 , 5 , 2 , 1};
        
        int idx = 0;
        while(amount != 0){
            while(coins[idx] <= amount){
                change.add(coins[idx]);
                amount -= coins[idx];
            }
            idx++;
        }
        
        return change;
        
    }
}