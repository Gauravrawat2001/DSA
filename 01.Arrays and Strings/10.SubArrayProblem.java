// PepCoding


import java.util.*;

class SubArrayProblem{

public static void main(String[] args) throws Exception {
    try (// write your code here
    Scanner scn = new Scanner(System.in)) {
        int n = scn.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        for(int sp = 0 ; sp < n; sp++){
            for(int ep = sp; ep < n; ep++){
                for(int p = sp; p <= ep; p++){
                    System.out.print(arr[p] +" ");
                }
                System.out.println();
            }
        }
    }
 }

}
