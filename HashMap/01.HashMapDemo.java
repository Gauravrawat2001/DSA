package HashMap;

import java.util.HashMap;

//  "static void main" must be defined in a public class.
 class Solution {
    public static void main(String[] args) {
      HashMap<String , Integer> ipl = new HashMap<>();
        
        // Insertion , O(1) avg , O(n) worst
        ipl.put("CSK", 3);
        ipl.put("MI", 4);
        ipl.put("KKR" , 2);
        ipl.put("SRH", 2);
        ipl.put("RR" , 1);
        ipl.put("GT" , 1);
        
        // Neither Insertion Order Nor Sorted on Keys/ Value
        System.out.println(ipl);
        
        ipl.put("CSK" , 4); // Updation / overrinding
        System.out.println(ipl); // O(N)
        
        System.out.println(ipl.size()); // Number of Keys
        
        // Read Get : Search
        System.out.println(ipl.get("CSK")); // this will return Key of CSk
        System.out.println(ipl.get("DC")); // this will return null
        
        // to get UserDefined Value
        System.out.println(ipl.getOrDefault("MI", 0));
        System.out.println(ipl.getOrDefault("DC", 0));

           
        // Iteration using key type // on HashMap
        for(String key : ipl.keySet()){
            System.out.println(key + " : " + ipl.get(key));
        }
        
        // Deletion 
        ipl.remove("KKR");
        System.out.println(ipl);
        ipl.remove("LSG"); // this will be ignored
        System.out.println(ipl);  
    }
}