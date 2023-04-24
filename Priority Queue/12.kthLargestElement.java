import java.util.PriorityQueue;

// import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int val : nums){
            if(pq.size() < k){
                pq.add(val);
            }else if(val > pq.peek()){
                pq.remove();
                pq.add(val);
            }
        }

        return pq.remove();
    }
}
