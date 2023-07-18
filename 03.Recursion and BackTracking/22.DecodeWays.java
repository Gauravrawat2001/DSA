// LC - 91 , Tle - because of not pruning - time => 2^N , Space -> N
class Solution {

    public int printWays(String input , int idx , String output){
        if(idx == input.length()){
            System.out.println(output);
            return 1;
        }

        int digit = input.charAt(idx) - '0';
        char letter = (char)(digit + 64);
        if(digit == 0) return 0;

        int ans = printWays(input , idx + 1, output + letter); // for 1 digit 

        if(idx + 1 < input.length()){ // for two digits
            digit = (input.charAt(idx) - '0') * 10 + (input.charAt(idx + 1) - '0');
            letter = (char)(digit + 64);
            if(digit >= 10 && digit <= 26){
                ans += printWays(input , idx + 2, output + letter);
            }
        }

        return ans;
    }
    public int numDecodings(String s) {
        return printWays(s , 0 , "");
    }
}
