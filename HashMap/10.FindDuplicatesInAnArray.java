// GFG
package HashMap;

import java.util.ArrayList;
import java.util.Arrays;

// Approach 1


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        
      ArrayList<Integer> res = new ArrayList<>();
      int n1 = Integer.MIN_VALUE;
      
      for(int i = 0; i < n - 1; i++){
          if(arr[i] == arr[i+1] && n1 != arr[i]){
              res.add(arr[i]);
              n1 = arr[i];
          }
      }
      
      if(res.isEmpty()){
          res.add(-1);
      }
      
      return res;
        
        
        
    }
}

// approach 2



class Solution2 {
    public static ArrayList<Integer> duplicates(int nums[], int n) {
        // code here
      // pass1 Mark visited
        for(int i = 0; i < n; i++){
            int val = nums[i] % (n + 1);
            nums[val] += n + 1;
        }
        
        ArrayList<Integer> repeating = new ArrayList<>();

        // to find duplicate
        for(int i = 0; i < n; i++){
            int freq = nums[i] / (n + 1);
            if(freq > 1) repeating.add(i);
        }

        if(repeating.size() == 0) repeating.add(-1);
        
        return repeating;
        
        
        
    }
}
