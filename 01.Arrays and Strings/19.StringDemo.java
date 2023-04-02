import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // String Creation
//         String str = "DSA";
//         String str1 = new String("Dev");
        
//         System.out.println(str);
//         System.out.println(str1);
        
        try (// how to take input of string
        Scanner scn = new Scanner(System.in)) {
            String str = scn.next(); // after the space no input will be taken
            System.out.println(str);
            
            String str1 = scn.nextLine(); // this will take whole input
            System.out.println(str1);
            
            // Loop on String;
            for(int i = 0 ; i < str1.length(); i++){
                char ch = str1.charAt(i);
                System.out.print(ch+" ");
            }
        }
        
        
    }
}
