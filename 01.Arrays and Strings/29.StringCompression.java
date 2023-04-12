// Leetcode

class Solution {
    public int compress(char[] chars) {
       String ans ="";
        int ptr1 = 0;
        int ptr2 = 0;

        while(ptr1 < chars.length) {
            ans += chars[ptr1];
             ptr2 = ptr1;
            int count = 0;

            while(ptr2 < chars.length && chars[ptr1] == chars[ptr2])
            {
                ptr2++;
                count++;
            }
            if(count > 1){
                ans += count;
            }
            
            ptr1 = ptr2;
        }

        int i = 0;
        while(i < ans.length()) {
            chars[i] = ans.charAt(i);
            i++;
        }
        return ans.length();
 
    }
}
