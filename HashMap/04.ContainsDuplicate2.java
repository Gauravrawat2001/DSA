package HashMap;

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Brute force 

        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j <= Math.min(nums.length - 1, i + k); j++){
        //         if(nums[i] == nums[j]) return true;
        //     }
        // }

        // return false;

        // approach 2
        HashMap<Integer , Integer> visited = new HashMap<>();

        for(int j = 0; j < nums.length; j++){
            Integer i = visited.get(nums[j]); // this will give value 

            if(i == null || j - i > k){
                visited.put(nums[j] , j);
            }else return true;
        }

        return false;
    }
}
