import java.util.ArrayList;
import java.util.List;

// LC , Time -> 2^n(calls^depth), Space -> N

class Solution {

    List<List<Integer>> powerset = new ArrayList<>();
 
    public void subsets(int[] nums, int idx , List<Integer> subset){
 
      if(idx == nums.length){
          powerset.add(new ArrayList<>(subset));
          return;
      }
 
        // for yes 
        subset.add(nums[idx]);
        subsets(nums,idx + 1, subset);
        subset.remove(subset.size() - 1); // backtracking
 
        // for no
        subsets(nums , idx + 1, subset);
    }
 
     public List<List<Integer>> subsets(int[] nums) {
         subsets(nums,0,new ArrayList<>()); // array , idx , new arrayList
         return powerset;
     }
 }
