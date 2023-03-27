// import java.io.*;
import java.util.*;

class Solution{

public static void main(String[] args) throws Exception {
    try (// write your code here
    Scanner scn = new Scanner(System.in)) {
        int row = scn.nextInt();
        int col = scn.nextInt();
        
        int[][] arr = new int[row][col];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }
    }
 }
}


