

// User function Template for Java
// time - O(n), Space - O(n) , GFG

class Solution {
    
    boolean checkSorted(int[] arr , int idx){
        if(idx == arr.length - 1) return true;
        
        if(arr[idx] > arr[idx + 1]){
            return false;
        }
        
       return checkSorted(arr , idx + 1);
    }
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        return checkSorted(arr , 0);
    }
}
