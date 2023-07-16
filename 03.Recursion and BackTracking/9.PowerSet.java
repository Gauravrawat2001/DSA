import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//User function Template for Java
// GFG , Time -> O(2^N) , Space -> 


class Solution

{
    
    List<String> result;
    // Print Subsequence Method 
    public void printSubString(String str , int idx , String out){
        if(idx == str.length()){
            // System.out.print(out + " ");
            if(out.length() == 0) return; // emply subsequence
            result.add(out);
            return;
        }
        
        printSubString(str , idx + 1 ,out +  str.charAt(idx));
        printSubString(str , idx + 1 , out);
    }
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
       
        result = new ArrayList<>();
        
        printSubString(s , 0 , "");
        
        Collections.sort(result);
        
        return result;
    }
}
