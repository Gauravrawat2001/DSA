import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode-cn.com/problems/combination-sum-ii
// LC , Time -> call^depth = 2^N , Space -> O(n)

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
        printWays(coins , idx + 1, target -coins[idx], output);
        output.remove(output.size() - 1);

        // no call
        if(output.size() > 0 && output.get(output.size() - 1) == coins[idx]){
            return;
        }
        printWays(coins , idx + 1, target , output);
    }

   public List<List<Integer>> combinationSum2(int[] coins, int target) {
       ways = new ArrayList<>();
       List<Integer> output = new ArrayList<>();
       Arrays.sort(coins);
       printWays(coins , 0 , target , output);
       return ways;

   }
}
