// LeetCode
class Solution {
    public boolean isPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;

        while(lo < hi){
            char currFirst = s.charAt(lo);
            char currLast = s.charAt(hi);
            if(!Character.isLetterOrDigit(currFirst)){
                lo++;
            }else if(!Character.isLetterOrDigit(currLast)){
                hi--;
            
            }else {
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                return false;
            }
            lo++;
            hi--;
            }
           
        }

        return true;
    }
}
