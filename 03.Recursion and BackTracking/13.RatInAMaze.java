import java.util.ArrayList;

// GFG , Time -> O(), Space -> O(N+M)

class Solution {
    
    static ArrayList<String> paths;
     
     public static void findPath(int[][] mat , int row , int col , String path){
         if(row < 0 || col < 0 || row == mat.length || col == mat[0].length){
             // index out of bound -> negative base case
             return;
         }
         
         if(mat[row][col] == -1 || mat[row][col] == 0){
             // visited calls or blocked call -> negative base case
             return;
         }
         
         if(row == mat.length -1 && col == mat[0].length - 1){
             paths.add(path); // path added 
             return; // postive Case
         }
         
         mat[row][col] = -1; // visited marked
         
         // top or up
         findPath(mat , row - 1, col , path +"U");
         
         findPath(mat , row , col + 1 , path + "R");
         
         findPath(mat , row + 1, col , path+ "D");
         
         findPath(mat , row , col - 1 , path + "L");
         
         mat[row][col] = 1; // unvisted marked
         
         
     }
     public static ArrayList<String> findPath(int[][] m, int n) {
         // Your code here
         paths = new ArrayList<>();
         findPath(m, 0, 0, "");
         return paths;
         
         
     }
 }