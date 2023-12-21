// leetcode -46 
//  time - exponential 2^n , Space -> N

class Solution {
    List<List<Integer>> ways;

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void printPaths(int[] nums, int i) {
        if (i == nums.length) {
            List<Integer> output = new ArrayList<>();
            for (int val : nums)
                output.add(val);
            ways.add(output);
            return;
        }

        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            printPaths(nums, i + 1);
            swap(nums, i, j); // backtracking
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        ways = new ArrayList<>();
        printPaths(nums, 0);
        return ways;
    }
}