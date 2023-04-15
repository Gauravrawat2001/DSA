package Graph;

// Leetcode , time -> O(N^2 + N^2) , Space -> O(N^2)
class Solution {

    public int dfs(int[][] grid , int r , int c){
        if( r < 0 || r >= grid.length || c < 0 || c >= grid[0].length){
            return 1;
        }
        if(grid[r][c] == 0) return 1;
        if(grid[r][c] == 2) return 0;
        grid[r][c] = 2;

        int count = 0;
         count += dfs(grid , r - 1 , c);
         count += dfs(grid , r , c + 1);
         count += dfs(grid , r + 1 , c);
         count += dfs(grid , r , c - 1);

       return count;  
    }
    public int islandPerimeter(int[][] grid) {
        
        if(grid == null) return 0;

        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    return dfs(grid , i , j);
                }
            }
        }

        return 0;
    }
}
