
// Leetcode 
package HashMap;

import java.util.ArrayList;
import java.util.List;

// approach
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int freq[] = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }

        for(int i = 1; i < freq.length; i++){
            if(freq[i] == 0) res.add(i);
        }

        return res;
    }
}


// Approach 2 
class Solution2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < nums.length ; i++){
            int val = (nums[i]) % (n + 1);
            nums[val - 1] += n + 1;

        }

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= n) res.add(i + 1);
        }

        return res;
    }
}
