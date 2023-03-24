import java.util.*;

//{ Driver Code Starts
//Initial Template for Java



// import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            int N = S.length();
            Solution ob = new Solution();
            String[] element = br.readLine().trim().split("\\s+");
		    int[] f = new int[N];
		    for(int i = 0; i < N; i++){
		        f[i] = Integer.parseInt(element[i]);
		    }
            ArrayList<String> res  = ob.huffmanCodes(S,f,N);
            for(int i = 0; i < res.size(); i++)
            {
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java

// Time -> O(n log n) , Space 
class Node implements Comparable<Node>{
    char ch = '#';
    int freq;
    Node left , right;
    
    public Node(char ch , int freq){
        this.ch = ch;
        this.freq = freq;
    }
    
    public Node(){}
    
    public int compareTo(Node other){
        if(this.freq < other.freq) return -1;
        else return +1;
    }
}

class Solution {
    
    public void preorder(Node root , String path , ArrayList<String> codes){
        if(root.ch != '#'){
            codes.add(path);
            return;
        }
        
        preorder(root.left, path +"0", codes);
         preorder(root.right, path +"1", codes);
        
    }
    public ArrayList<String> huffmanCodes(String S, int f[], int N)
    {
        // Code here
        PriorityQueue<Node> pq = new PriorityQueue<>();
        
        for(int idx = 0;idx < N ; idx++){
            pq.add(new Node(S.charAt(idx), f[idx]));
        }
        
        // Huff man Tree Construction
        
        while(pq.size() > 1){
            Node root = new Node();
            root.left = pq.remove();
            root.right = pq.remove();
            root.freq = root.left.freq + root.right.freq;
            pq.add(root);
        }
        
        Node root = pq.remove();
        ArrayList<String> codes = new ArrayList<>();
        preorder(root , "", codes);
        return codes;
            
        
    }
}