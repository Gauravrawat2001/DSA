package HashMap;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet approach
        HashSet<Integer> visited = new HashSet<>();

        for(int key : nums){
            if(visited.contains(key) == true) return true;
            visited.add(key);
        }

        return false;
    }
}
