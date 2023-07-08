// GFG , Time -> O(N) , Space -> O(N) recursion stack space , Recursive approach so may give stack over flow

class Solution
{ 
    // Function to find starting and end index 
    static int[] linearSearch(int arr[] , int target , int idx){
        if(idx == arr.length){
            return new int[]{-1,-1}; 
            // target not found
        }
            
            int[] ans = linearSearch(arr , target , idx + 1);
            
            if(arr[idx] == target){
                if(ans[0] == -1){
                    ans[0] = ans[1] = idx;
                }else{
                    ans[0] = idx;
                }
            }
            
            return ans; //  current element is not equal to target
        
    }
    static int[] findIndex(int arr[], int N, int target) 
    { 
        //code here.
        return linearSearch(arr , target , 0);
    }
}