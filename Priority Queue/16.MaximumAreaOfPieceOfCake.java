import java.util.ArrayList;
import java.util.Collections;

// leetcode -> 1456 , time -> O() , Space -> O(1)

class Solution {

    public long getLength(long h , int[] rows){
       ArrayList<Long> res = new ArrayList<>();
       for(long val : rows) res.add(val);
       res.add(0l);
       res.add(h);
       Collections.sort(res);

       long length = 0;

       for(int i = 1; i < res.size(); i++){
           long diff = res.get(i) - res.get(i - 1);
           length = Math.max(length , diff);
       }

       return length;
    }

    public long getBreadth(long w , int[] cols){
        ArrayList<Long> res = new ArrayList<>();
       for(long val : cols) res.add(val);
       res.add(0l);
       res.add(w);
       Collections.sort(res);

       long breadth = 0;

       for(int i = 1; i < res.size(); i++){
           long diff = res.get(i) - res.get(i - 1);
           breadth = Math.max(breadth , diff);
       }

       return breadth;
    }
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long length = getLength(h , horizontalCuts);
        long breadth = getBreadth(w , verticalCuts);

        int area = (int)((length * breadth) % 1000000007);

        return area;
    }
}
