// Leetcode
package HashMap;

// Approach 1
class Solution {
    public int findDuplicate(int[] nums) {
        int repeat = 0;
        int[] freq = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }

        for(int i = 0 ; i < freq.length; i++){
            if(freq[i] > 1) repeat = i;
        }

        return repeat;
    }
}

// Approach 2
class Solution2 {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        // pass1 Mark visited
        for(int i = 0; i < n; i++){
            int val = nums[i] % (n + 1);
            nums[val] += n + 1;
        }

        // to find duplicate
        for(int i = 0; i < n; i++){
            int freq = nums[i] / (n + 1);
            if(freq > 1) return i;
        }

        return -1;

    }
}


