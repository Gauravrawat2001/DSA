import java.util.ArrayList;
import java.util.List;
//  https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/995671519/
// Leetcode 17 
// Time ->  max calls^depth = 4^input.length , Space - O(N)
class Solution {
    String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> ways;

    public void printPaths(String input , int idx , String output){
        if(idx == input.length()){
            ways.add(output);
            return;
        }
        int digit = input.charAt(idx) - '0'; // to change char into digit

        for(char letter : map[digit].toCharArray()){ // to change in to array becase we cant  run for each loop on string
        printPaths(input , idx + 1 , output + letter);

        }
    }
    public List<String> letterCombinations(String digits) {
        ways = new ArrayList<>();
        if(digits.length() == 0){
            return ways;
        }

        printPaths(digits , 0 ,"");
        return ways;
    }
}