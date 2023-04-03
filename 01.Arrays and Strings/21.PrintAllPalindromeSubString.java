// Pepcoding

import java.util.*;

 class Main {
    
    public static boolean isPalindrome(String str){
        int lo = 0 , hi = str.length() - 1;
        
        while(lo < hi){
            if(str.charAt(lo) != str.charAt(hi)) return false;
            lo++;
            hi--;
        }
        
        return true;
    }

	public static void solution(String str){
		//write your code here
		for(int i = 0; i < str.length(); i++){
		    for(int j = i; j < str.length(); j++){
		        String substr = str.substring(i , j + 1);
		        if(isPalindrome(substr) == true){
		            System.out.println(str);
		        }
		    }
		}
		
		
	}

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
            String str = scn.next();
            solution(str);
        }
	}

}
