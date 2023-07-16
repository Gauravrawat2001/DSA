import java.util.ArrayList;
import java.util.List;

// leetCode , time - exponential 2^n , Space -> N
// Approach 1
class Solution1 {
    List<List<Integer>> res;

    public void printPaths(int n , int k , List<Integer> output){
        if(k == 0){
            // positive base case 
            res.add(new ArrayList<>(output)); // deep copy
            return;
        }

        if(n == 0 || k > n){
            //negative base case
            return;
        }

        // yes call
        output.add(n);
        printPaths(n - 1, k - 1, output);
        output.remove(output.size() - 1); // backtracking

        // no calls
        printPaths(n - 1 , k , output);
    }
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        printPaths(n , k , output);
        return res;
    }
}

// Approach 2 , time -> n^k , Space - 
class Solution2 {
    List<List<Integer>> res;

    public void printPaths(int n , int k , List<Integer> output , int last){
        if(k == 0){
            // positive base case 
            res.add(new ArrayList<>(output)); // deep copy
            return;
        }

       // calls
       for(int item = last + 1; item <= n; item++){
           output.add(item);
           printPaths(n ,k - 1 , output , item);
           output.remove(output.size() - 1); // backtracking
       }
    }
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        printPaths(n , k , output, 0);
        return res;
    }
}