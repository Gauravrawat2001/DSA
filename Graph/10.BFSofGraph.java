package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

// GFG , time -> O(N + E), Space -> O(E) queue and O(E + V) space as bfs
// when you visited while popping , in this we will visit all the edges
class Solution1 {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        
        
        boolean[] vis = new boolean[V];
        
        while(q.size() > 0){
            int src = q.remove();
            if(vis[src] == true) continue;
            
            vis[src] = true;
            ans.add(src);
            for(Integer nbr : adj.get(src)){
                q.add(nbr);
            }
        }
        
        return ans;    
            
    }
}


// when you visite while pushiig , in this we will visit all node
class Solution2 {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0); // source node 
        boolean[] vis = new boolean[V];
        vis[0] = true;
        
        while(q.size() > 0){
            int src = q.remove();
            ans.add(src);
            
            for(Integer nbr : adj.get(src)){
                if(vis[nbr] == false){
                    q.add(nbr);
                    vis[nbr] = true;
                }
            }
        }
     return ans;    
            
    }             
}
