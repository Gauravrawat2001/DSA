package LeetCodeDailyChallenge;

import java.util.Comparator;
import java.util.PriorityQueue;

// Leetcode  date - 24/04/2023

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int stone : stones){
            pq.add(stone);
        }

        while(pq.size() > 1){
            int y = pq.remove();
            int x = pq.remove();

            pq.add(y - x);
        }

        return pq.remove();
    }
}