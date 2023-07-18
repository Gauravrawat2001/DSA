import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LC , Time -> 2^N , Space -> O(N)
class Solution {

    List<List<Integer>> res;

    public void subsets(int[] nums , int idx , List<Integer> output){
         if(idx == nums.length){ // base case 
             res.add(new ArrayList<>(output)); // deep copy
             return;
         }

         // Yes call 
         output.add(nums[idx]);
         subsets(nums , idx + 1 , output);
         output.remove(output.size() - 1); // backtracking

         // no call
         if( output.size() > 0 && output.get(output.size() - 1) == nums[idx]){ // to remove duplicate subsets dry run to get the logic
             return;
         }
         subsets(nums , idx + 1, output);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums , 0 , output);
        return res;

    }
}