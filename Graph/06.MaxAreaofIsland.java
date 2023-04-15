package Graph;

// Leetcode , Time -> O(n^2 + n^2) , Space - (N^2) recursive stack space
class Solution {

    public int dfs(int[][] grid , int r , int c){
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length){
            return 0;
        }
        if(grid[r][c] == 0 || grid[r][c] == 2){
            return 0;
        }
        grid[r][c] = 2;
        int area = 1;
        area += dfs(grid , r - 1 , c);
        area += dfs(grid , r , c + 1);
        area += dfs(grid , r + 1 , c);
        area += dfs(grid , r , c - 1);

        return area;
    }
    

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea , dfs(grid , i , j));
                }
            }
        }

        return maxArea;
    }
}
