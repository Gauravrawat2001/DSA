// Leetcode

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        int i = s.length() - 1;

        while(i >= 0){
            int j = i - 1;
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            
            int k = j;
            while(k >= 0 && s.charAt(k) == ' '){ // to ignore the extra zeroes from the string
                k--;
            }

            for(int x = j + 1; x <= i; x++){
                sb.append(s.charAt(x));
            }

            i = k;
            if(i >= 0){
                sb.append(" ");
            }
        }

        return sb.toString().trim(); // to ignore last and first occurences of zeroes in string
    }
}
