// GFG

class Solution{
    
    // Function to check if given number n is a power of two.

    public static boolean isPowerofTwo(long n){
        
        // Your code here
        long pow = 1;
        while(pow < n){
            pow *= 2;
        }
        
        return(pow == n);
    }

    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n == 1){
            return true ;
        }
        int res = 1;
        for(int i = 1; i <=n; i++){
            res = 2 * res;
            if(res == n){
                return true;
            }
        }
        
        return false;
        
    }
    
}

// recursive solutiion
class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n == 1){
            return true;
        }
        
        if(n <= 0){
            return false;
        }
        
        if(n % 2 == 0){
            return isPowerofTwo(n / 2);
        }else{
            return false;
        }
        
    }
    
}