// Leetcode , approach -> binary Search in each Row , time -. O(n log n) , Space -> O(1);
class Solution {

    public boolean rowSearch(int[][] mat , int row , int target){
        int left = 0 , right = mat[0].length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(mat[row][mid] == target) return true;
            else if(mat[row][mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        // Search in each Row

        for(int row = 0; row < matrix.length; row++){
            if(rowSearch(matrix , row, target) == true) return true;
        }

        return false;
    }
}

// Leetcode -> approach 2 - start from top right corner if(target > mat[i][j]) move down , if (target < mat[i][j]) move left or Stair case Search


class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
     // StairCase Search 
     // Time -> O(N + M)
     int i = 0, j = matrix[0].length - 1;

     

     while(i < matrix.length && j >= 0){
         if(matrix[i][j] == target) return true;
         else if(target < matrix[i][j]) j--;
         else i++;
     }

     return false;

    }
}