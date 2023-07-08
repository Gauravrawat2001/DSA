// time - O(n) , Space -> O(N)stackoverflow
class Solution {
    //Just print the space seperated array elements
    void printArrayHelper(int[] arr , int idx){
        if(idx == arr.length) return;
        
        System.out.print(arr[idx] + " ");
        printArrayHelper(arr , idx + 1);
    }
    void printArray(int arr[], int n) {
        //   code here
        printArrayHelper(arr , 0);
        
    }
}