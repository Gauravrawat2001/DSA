package Graph;

import java.util.ArrayList;

// Leetcode ,Time - O(N + E), Space -> O(N + E) due to edgeList

class Graph{
    int n;
    ArrayList<Integer>[] adj;
    
    @SuppressWarnings("all")
    public Graph(int n){
        this.n = n;
        adj = new ArrayList[n];
        for(int i = 0; i < n; i++){
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int src , int dest){
        adj[src].add(dest);
        adj[dest].add(src);
    }

    public long dfs(int src , boolean[] vis){
        if(vis[src] == true) return 0;
        
        vis[src] = true;
        long size = 1l;
        for(int nbr : adj[src]){
            size += dfs(nbr , vis);
        }

        return size;
    }
}
class Solution {
    public long countPairs(int n, int[][] edges) {
       

        Graph g = new Graph(n);
        for(int[] edge : edges)
          g.addEdge(edge[0], edge[1]);

        boolean[] vis = new boolean[n];
        long answer = 0l;
        for(int i = 0; i < n; i++){
            long size = g.dfs(i , vis);
            answer += size * (n - size);
        } 

        return answer / 2;
    }
}
