import java.util.*;

class Solution
{
    //Function to return k largest elements from an array.
    // Approach 1
    public static ArrayList<Integer> kLargest1(int arr[], int n, int k)
    {
        // code here 
        Arrays.sort(arr); //  O(n log n)
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int i = arr.length - 1;
        while(k != 0){
            res.add(arr[i]);
            i--;
            k--;
        }
        
        return res;
        
    }
     // Approach 2
    public static ArrayList<Integer> kLargest2(int arr[], int n, int k)
     {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
        
        for(int val : arr) pq.add(val); //  offline algo : O(N) Insertion for N elements Assumption
        
        ArrayList<Integer> res = new ArrayList<>();
        
        while(res.size() < k){
            res.add(pq.remove());
        }
        
        return res;
     }

     // Approach 3
      // Approach 3  , time -> O(n logk + k logk) , space -> O(k)
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int val : arr){
            if(pq.size() < k){
                pq.add(val);
            }else if (val > pq.peek()){
                pq.remove();
                pq.add(val);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        while(pq.size() > 0){
            res.add(pq.remove());
        }
        Collections.reverse(res);
        
        return res;
    }
}