// LeetCode

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
       
       class Solution extends VersionControl {
         int firstBadVersion(int n) {
            int left = 0, right = n;
    
            while(left <= right){
                int mid = left + (right - left )/2;
    
                if(isBadVersion(mid) == false){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
    
            return left;
        }
    }
