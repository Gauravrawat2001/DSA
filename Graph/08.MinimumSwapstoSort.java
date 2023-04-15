package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// GFG 
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

    public int dfs(int src , boolean[] vis){
        if(vis[src] == true) return 0;
        
        vis[src] = true;
        int size = 1;
        for(int nbr : adj[src])
             size += dfs(nbr , vis);
        return size;         
    }
}

class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
  
    public int minSwaps(int nums[])
    {
        // Code here
        HashMap<Integer , Integer> oldIdx = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            oldIdx.put(nums[i] , i);
        }
        
        Arrays.sort(nums);
        Graph g = new Graph(nums.length);
        for(int i = 0; i < nums.length; i++){
            int j = oldIdx.get(nums[i]);
            g.addEdge(i , j);
        }
        
        int swaps = 0;
        boolean[] vis = new boolean[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            if(vis[i] == true) continue;
           swaps += g.dfs(i , vis) - 1;
            // swaps += (size - 1);
            
        }
        
        return swaps;
        
    }
}

