package Graph;

import java.util.ArrayList;

// Leetcode 1971 , Time -> O(n + e) due to DFS  , Space -> O(n + e) due to adjacency list , O(N) recursion stack space
class Graph{
    public int n; //  number of vertices
     public ArrayList<Integer>[] adj;
     
     public Graph(int n){
         this.n = n;
        //  adj = new ArrayList[n];
         for(int i = 0; i < n; i++){
             adj[i] = new ArrayList<>();
         }
         
     }
     // unweighted , directed
     public void addEdge(int src, int dest){
         adj[src].add(dest);
         adj[dest].add(src); //Gr runs only when graph is undirected
     }
 
     public boolean hasPath(int src , int dest , boolean[] vis){
         if(src == dest) return true;
         if(vis[src] == true) return false;
 
         vis[src] = true;
         for(int nbr : adj[src]){
             if(hasPath(nbr , dest , vis) == true)
             return true;
         }
 
         return false;
     }
    public boolean DFS2(int source, int destination, boolean[] vis) {
        return false;
    }
     
    
     
 }
 class Solution {
     public boolean validPath(int n, int[][] edges, int source, int destination) {
         Graph g = new Graph(n);
         for(int[] edge : edges)
             g.addEdge(edge[0] , edge[1]);
 
         boolean[] vis = new boolean[n];
         return  g.hasPath(source , destination , vis) ;  
     }
 }

 // Soltuion 2 
 class Graph1{
    public int n;
    public ArrayList<Integer>[] adj;

    public Graph1(int n){
        this.n = n;
        //adj = new ArrayList[n];
        for(int i = 0; i < n; i++){
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int src , int dest){
        adj[src].add(dest);
        adj[dest].add(src);
    }

    public boolean hasPath( int src , int dest , boolean[] vis){
        if(src == dest) return true;
        if(vis[src] == true) return false;

        vis[src] = true;
        for(int nbr : adj[src]){
            if(hasPath(nbr , dest , vis) == true) return true;
        }

        return false;
    }

    public boolean DFS2( int src , int dest , boolean[] vis){
        if(src == dest) return true;

        
        for(int nbr : adj[src]){
            if(vis[nbr] == false){
                vis[nbr] = true;
                if(DFS2(nbr , dest , vis) == true)
                     return true;
        }
    }

        return false;
    }
}

class Solution2 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        Graph g = new Graph(n);
        for(int[] edge : edges){
            g.addEdge(edge[0], edge[1]);
        }

        boolean[] vis = new boolean[n];
        vis[source] = true;
        return g.DFS2(source , destination , vis);
    }
}