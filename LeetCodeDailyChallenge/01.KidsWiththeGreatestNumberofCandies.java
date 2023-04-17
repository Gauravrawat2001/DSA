package LeetCodeDailyChallenge;

import java.util.ArrayList;
import java.util.List;

// 17th april , time -> (N) , space -> O(1)

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            max = Math.max(candies[i], max);
        }

        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                res.add(true);
            }else{
                res.add(false);
            }
        }

        return res;
    }
}
