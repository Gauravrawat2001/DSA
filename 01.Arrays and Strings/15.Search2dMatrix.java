// leetcode - approach  binary search in each row, time - O(n log n), Space - O(1)
class Solution {

    public boolean searchRow(int[][] mat , int row , int target){
        int left = 0, right = mat[0].length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(mat[row][mid] == target) return true;
            else if(mat[row][mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        // search in each row 
        for(int row  = 0; row < matrix.length; row++){

            if(searchRow(matrix , row , target) == true) return true;
        }

        return false;
    }
}

// Most optimized Approach
class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // most optimized approach 
        // convert it into one - array // or assume
        // let idx of 1 D array be = idx
        // row idx of 2D array = idx / cols;
        // col idx of 2D array = idx % col;

        int low = 0;
        int high = matrix.length * matrix[0].length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            int ridx = mid / matrix[0].length ;
            int cidx = mid % matrix[0].length;

            if(matrix[ridx][cidx] == target) return true;
            else if(matrix[ridx][cidx] < target) low = mid + 1;
            else high = mid - 1;

        }

        return false;
    }
}