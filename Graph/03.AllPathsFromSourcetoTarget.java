package Graph;

import java.util.ArrayList;
import java.util.List;

// Leetcode - 797 , Time -> exponential , Space- O(N) not including recursive stack space

class Solution {
    List<List<Integer>> paths = new ArrayList<>();

    public void dfs(int src , int dest , int[][] graph, List<Integer> path){
          path.add(src);
         
           if(src == dest){
               paths.add(new ArrayList<>(path));// deepcopy
           }

           for(int nbr : graph[src]){
               dfs(nbr , dest , graph , path);
           }
        path.remove(path.size() - 1);// backtraking

           

    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        dfs(0, n - 1 , graph, new ArrayList<>());
        return paths;
    }
}
