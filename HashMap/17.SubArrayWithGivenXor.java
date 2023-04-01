package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
// InterviewBit
class Solution {
    public int solve(ArrayList<Integer> A, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 , 1);
        
        int xor = 0 , count = 0;
        for(int val : A){
            xor = xor ^ val;
            
            int freq = map.getOrDefault(xor ^ k , 0);
            count += freq;
            
            map.put(xor , map.getOrDefault(xor , 0) + 1);
        }
        
        return count;
    }
}
