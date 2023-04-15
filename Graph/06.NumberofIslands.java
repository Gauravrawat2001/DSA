package Graph;
// Leetcode , Time - O(n^2 + n^2) , Space -> O(n^2) recursion stack space
class Solution {

    public void dfs(char[][] grid , int r , int c){
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length){ // out of grid
            return;
        }
        if(grid[r][c] == '0' || grid[r][c] == '2') return; // not a land or already visited

        grid[r][c] = '2'; // visit

        dfs(grid , r - 1, c); // top
        dfs(grid , r , c + 1); // right
        dfs(grid , r + 1, c); // down
        dfs(grid , r , c - 1); // left 
    }
    public int numIslands(char[][] grid) {
        
        int isLands = 0;

        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    isLands++;
                    dfs(grid , i , j);
                }
            }
        }

        return isLands;
    }
}