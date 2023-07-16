import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode-cn.com/problems/coin-change
// LC , Time -> 2^N , Space -> O(N)

class Solution {
    List<List<Integer>> ways;

     public void printWays(int[] coins , int idx , int target , List<Integer> output){
         // base case 
         if(target < 0){
             return; // negative base case 
         }

         if(idx == coins.length){
             if(target == 0){
                 ways.add(new ArrayList<>(output)); // postive base case
             }
             return;
         }

         // Yes call 
         output.add(coins[idx]);
         printWays(coins , idx , target -coins[idx], output); // if yes giev chnace to the same coin to infinity supply
         output.remove(output.size() - 1);

         // no call
        //  if(output.size() > 0 && output.get(output.size() - 1) == coins[idx]){
        //      return;
        //  }  // no dupilicates thats why not required
         printWays(coins , idx + 1, target , output);
     }

    public List<List<Integer>> combinationSum(int[] coins, int target) {
        ways = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        Arrays.sort(coins);
        printWays(coins , 0 , target , output);
        return ways;

    }
}