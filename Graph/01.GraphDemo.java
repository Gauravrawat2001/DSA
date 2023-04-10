// Time -> O(n + e); Space -> O(n + e) // vertex and edges
package Graph;
import java.util.ArrayList;
import java.util.Scanner;

// "static void main" must be defined in a public class.
class Graph{
    int n; //  number of vertices
    ArrayList<Integer>[] adj;
    
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
        adj[dest].add(src); //Gr runs only when graph is undirected
    }
    
   
    
}
 class Main {
    public static void main(String[] args) {
       try (Scanner scn = new Scanner(System.in)) {
        int n = scn.nextInt();
        
        Graph g = new Graph(n);
        
        int e = scn.nextInt();
        while(e-- > 0){
            int src = scn.nextInt();
            int dest = scn.nextInt();
            g.addEdge(src , dest);
        }
        
       for(int i = 0; i < n; i++){
           System.out.println(g.adj[i]);
       }
    }
        
    }
}
