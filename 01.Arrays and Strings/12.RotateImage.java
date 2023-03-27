// LeetCode - 48 
class Solution {

    public void transpose(int[][] mat){
       for(int i = 0; i < mat.length; i++){
           for(int j = i; j < mat[0].length; j++){
                 int temp = mat[i][j];
                 mat[i][j] = mat[j][i];
                 mat[j][i] = temp;
           }
       }
    }

    // reversing the row 
    public void reverse(int[][] matrix , int i){
        int low = 0 , high = matrix[0].length - 1;

        while(low <= high){
            int temp = matrix[i][low];
            matrix[i][low] = matrix[i][high];
            matrix[i][high] = temp;
            low++;
            high--;
        }
    }
    public void rotate(int[][] matrix) {
       // travers only in upper triangle
        transpose(matrix);

        // reverse every row
        for(int i = 0; i < matrix.length; i++){
            reverse(matrix , i);
        }
    }
}
