import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
       
        Arrays.sort(intervals, (t, o) -> {
            if(t[0] < o[0]) return -1;
            else if(t[0] > o[0]) return +1;
            else return 0;
        }); 

        // Arrays.sort(intervals , (t , o) -> t[0] - o[0]);    

    

       List<int[]> res = new ArrayList<>();

       for(int[] curr : intervals){
           int[] last = (res.size() == 0) ? null : res.get(res.size()- 1);

           if(last == null || last[1] < curr[0]){
               res.add(curr);
           }else{
               last[1] = Math.max(last[1] , curr[1]);
           }
       }

       int[][] mat = new int[res.size()][2];
       for(int i = 0; i < res.size(); i++){
          mat[i] = res.get(i);
       }

       return mat;
   }
}
