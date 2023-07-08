class Solution {
   // Approach 1 , time -> linear , Space -> linear , LC- 50
    public double pow(double x , long n){
        if(n == 0) return 1.0; // base case
        
        double sans = pow(x , n - 1); // faith 

         double bans = x * sans;
         return bans;

    }
      
    // Approach 2 -> optimized , time - O(logN), Space - log(n) , LC - 50 // better search exists using binary number exponentian 
    //using iteration and bit manupulation.

public double pow2(double x , long n){
    if(n == 0) return 1.0; // base case
    
    double sans = pow(x , n/2); // faith 

   
         double bans = sans * sans;
     
         if(n % 2 == 1){
             bans = x * bans;
        }
     
     return bans;

}

     


    public double myPow(double x, int n) {
        if(n < 0) return  1.0 / pow (x , -1l * n); // 1l because of cycle numeric system -(-2^31) != 2^31

        return pow(x , n);
    }
}




