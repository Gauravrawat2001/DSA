// LC , Time - calls = N , depth = N => calls^(depth) => N^N => exponentioal , Space = O(N);
class Solution {
    int count = 0;

    public void nQueens(boolean[][] chess , int row , int n){
        // Base case 
        if(row == n){
            count++;
            return;
        }

        // recursive calls 
        for(int col = 0; col < n; col++){
             if(isQueenSafe(chess , row , col , n) == false)
             continue;
             chess[row][col] = true;
             nQueens(chess , row + 1 , n);
             chess[row][col] = false; // backtracking
        }
    }

     public boolean isQueenSafe(boolean[][] chess ,int row ,int col , int n){
       // for top 
       for(int r = row ; r >= 0; r--){
           if(chess[r][col] == true){
               return false;// not safe
           }
       }

       // for top left 
       for(int r = row , c = col; r >= 0 && c >= 0 ; r-- , c--){
           if(chess[r][c] == true){
               return false;
           }
       }

       // top right
       for(int r = row , c = col; r >= 0 && c < n ; r-- , c++){
           if(chess[r][c] == true){
               return false;
           }
       }

       return true;
    }

    public int totalNQueens(int n) {
        boolean[][] chess = new boolean[n][n];
        nQueens(chess , 0 , n);
        return count;
    }
}