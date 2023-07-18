
import java.util.* ;
import java.util.ArrayList;

// coding Ninjas , time - > 2^N , Space -> N(Stack space)



 class Solution {

	static ArrayList<String> ways;
	public static void printPaths(String input , int idx , String output , int count){
		if(idx == input.length()){
			output = output + ((count > 0) ? ("" + count) : "");
			ways.add(output);
			return;
		}
		// No call
		printPaths(input , idx + 1, output , count + 1);

		// Yes call 
		char ch = input.charAt(idx);
		output = output + ((count > 0) ? ("" + count) : "");
		printPaths(input , idx + 1, output + ch , 0);
	}

		
	public static ArrayList < String > findAbbr(String str) {
		// Write your code here.
		ways = new ArrayList<>();
		printPaths(str , 0 , "" , 0);
		Collections.sort(ways);
		return ways;
	}
}