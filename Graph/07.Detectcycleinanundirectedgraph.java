package Graph;
// GFG

import java.util.ArrayList;

class Solution {
    // Function to detect cycle in an undirected graph.
    ArrayList<ArrayList<Integer>> adj;
    boolean[] vis;
    
    public boolean hasPathDFS(int src , int par){
        if(vis[src] == true) return true;
        
        vis[src] = true;
        for(int nbr : adj.get(src)){
            if(nbr == par) continue;
            if(hasPathDFS(nbr , src) == true)
               return true;
        }
        
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        this.adj = adj;
        this.vis = new boolean[V];
        
        for(int i = 0; i < V; i++){
            if(vis[i] == false && hasPathDFS(i , -1) == true)
                return true;
        }
        return false;
    }
}
