
class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int p1 = 0, p2 = 0;
        int trains = 0 , platforms = 0;
        
        while(p1 < n){
            if(arr[p1] <= dep[p2]){
                trains++;
                platforms = Math.max(platforms , trains);
                p1++;
            }else{
                trains--;
                p2++;
            }
        }
        
        return platforms;
        
    }
    
}
