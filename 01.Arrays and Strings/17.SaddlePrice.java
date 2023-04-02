// Pepcoding

import java.io.*;
import java.util.*;

 class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[][] arr = new int[n][n];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            int lci = 0;
            
            for(int j = 1; j < arr[0].length; j++){
                if(arr[i][j] < arr[i][lci]){
                    lci = j;
                }
            }
            
            boolean flag = true;
            
            for(int k = 0; k < arr.length; k++){
                if(arr[k][lci] > arr[i][lci]){
                    flag = false;
                    break;
                }
            }
            
            if(flag == true){
                System.out.println(arr[i][lci]);
                return;
            }
            
            
        }
        
        System.out.println("Invalid input");
    }

}