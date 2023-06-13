// GFG , time - O(logN)

class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        if(arr[n - 1] == 0) return -1;
        
        int left = 0 , right = arr.length - 1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(arr[mid] == 0){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        
        return left;
    }
}


