package HashMap;

import java.util.HashSet;

// "static void main" must be defined in a public class.
 class Main {
    public static void main(String[] args) {
        HashSet<String> ipl = new HashSet<>();
        
        ipl.add("CSK");
        ipl.add("Mi");
        ipl.add("DC");
        ipl.add("KKR");
        ipl.add("RR");
        
        System.out.println(ipl); 
        
        System.out.println(ipl.contains("CSK"));
        System.out.println(ipl.contains("LSG"));
        
        for(String key : ipl){
            System.out.println(key);
        }
        
        
    }
}