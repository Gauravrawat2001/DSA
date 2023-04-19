package Graph;

import java.util.ArrayList;

// Leetcode - > 1319

class Graph{
    int n; //  number of vertices
    ArrayList<Integer>[] adj;
    
    @SuppressWarnings("all")
    Graph(int n){
        this.n = n;
        adj = new ArrayList[n];
        for(int i = 0; i < n; i++){
            adj[i] = new ArrayList<>();
        }
        
    }
    // unweighted , directed
    public void addEdge(int src, int dest){
        adj[src].add(dest);
        adj[dest].add(src); //this runs only when graph is undirected
    }

    public void dfs(int src , boolean[] vis){
        if(vis[src] == true) return;
        
        vis[src] = true;
        for(int nbr : adj[src])
             dfs(nbr , vis);
    }
    
   
    
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(n - 1 > connections.length) return -1;

        Graph g = new Graph(n);
        for(int[] edge : connections){
            g.addEdge(edge[0] , edge[1]);
        }

        boolean[] vis = new boolean[n];
        int components = 0;
        for(int i = 0; i < n; i++){
            if(vis[i] == true) continue;
            components++;
            g.dfs(i, vis);
        }

        return components - 1;
    }

    public Solution() {
    }
}
