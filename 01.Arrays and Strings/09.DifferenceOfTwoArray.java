
// pepCoding
import java.io.*;
import java.util.*;

public class Main{
    
    public static  int[] diff(int[] arr1 , int[] arr2){
        int[] ans = new int[arr2.length];
        
        int i = arr1.length - 1, j = arr2.length - 1, k = ans.length - 1;
        int bo = 0;
        
        while(j <= 0){
            int d1 = (i >= 0) ? arr1[i] : 0;
            int d2 = arr2[j];
            
            if(d2 - d1 + bo < 0){
                ans[k] = d2 - d1 + bo + 10;
                bo = -1;
            }else{
                ans[k] = d2 - d1 + bo;
                bo = 0;
            }
            i--; j--; k--;
        }
        
        return ans;
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    
    int arr1 = new int[n1];
    int[] arr;
    for(int i = 0; i < n1;i++){
        arr[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    
    int arr2 = new int[n2];
    for(int i = 0; i < n2;i++){
        arr[i] = scn.nextInt();
    }
    
    int[] ans = diff(arr1 , arr2);
    
    int idx = 0;
    
    while( idx < ans.length && ans[idx] == 0){
        idx++;
    }
    
    for(int i = idx; i < ans.length; i++){
        
        System.out.println(ans[i]);
    }
    
    
 }

}
