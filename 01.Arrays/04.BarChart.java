import java.util.*;
 class Solution{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        int[] arr = new int[t];
        for(int i = 0 ; i < t; i++){
            arr[i] = scn.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        
        int row = max;
        
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= arr.length; j++){
                if(arr[j] >= max){
                    System.out.print("*");
                }else{
                    System.out.print("\t");
                }
                max--;
            }
            System.out.println();
        }
     }
    
    }