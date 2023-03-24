// Time -> O(n)
class Compute 
{
    static void getMinMax(long a[], long n)  
    {
        //Write your code here
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            if(a[i] < min) min = a[i];
            if(a[i] > max) max = a[i];
        }
        
        System.out.println(min);
        System.out.println(max);

    }
}