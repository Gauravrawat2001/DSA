// GFG , time -> O(N) , Space -> O(N)
class Compute {
    
    public int max(int[] arr ,int idx){
        if(idx == arr.length) return Integer.MIN_VALUE;
        
        int sans = max(arr , idx + 1);
        
        int bans = Math.max(arr[idx] , sans);
        
        return bans;
    }
    
    public int largest(int arr[], int n)
    {
      return max(arr , 0);
    }
}