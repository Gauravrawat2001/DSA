package Graph;

// leetcode -> time O(N + E) if input is given in adjencencyList otherwise O(N^2) due to matrix input , Space -> O(N + E)

import java.util.ArrayList;

class Graph{
    int n;
    ArrayList<Integer>[] adj;
     
    @SuppressWarnings("all")
    public Graph(int n){
       this.n = n;
       adj =  new ArrayList[n];
       for(int i = 0; i < n; i++){
           adj[i] = new ArrayList<>();
       }
    }

    public void addEdge(int src , int dest){
        adj[src].add(dest);
        adj[dest].add(src);
    }

    public void dfs(int src , boolean[] vis){
        if(vis[src] == true) return;

        vis[src] = true;
        for(int nbr : adj[src]){
            dfs(nbr , vis);
        }
    }
}
class Solution {
    public int findCircleNum(int[][] graph) {
        int n = graph.length;

        Graph g = new Graph(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j && graph[i][j] == 1){
                    g.addEdge(i , j);
                }
            }
        }
         
        int components = 0;
        boolean[] vis = new boolean[n];
        for(int i = 0; i < n; i++){
            if(vis[i] == true) continue;
            g.dfs(i , vis);
            components++;
        }

        return components;
    }
}
