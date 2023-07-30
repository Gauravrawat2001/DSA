  // LC , Time -> O(N + N logN) , Space -> O(N) leftArray , right Array  due to merging  , recursion call stack space ;
  class Solution {
    // Recursive Code (Divide and Conquer)
     public int[] mergeSort(int[]nums , int l , int r){
          if(l == r) {
              int[] ans = new int[1];
              ans[0] = nums[l];
              return ans;
          }
         int mid = (l + r)/2;
         int[] left = mergeSort(nums, l, mid);
         int[] right = mergeSort(nums, mid + 1, r);
 
         return merge(left,right);
     }
 
     public int[] merge(int[] arr1, int[] arr2){
         int[] res = new int[arr1.length + arr2.length];
         int idx1 = 0, idx2 = 0, idx3 = 0;
 
         while(idx1 < arr1.length && idx2 < arr2.length){
             if(arr1[idx1] <= arr2[idx2]){
                 res[idx3] = arr1[idx1];
                 idx3++;
                 idx1++;
             }else{
                 res[idx3] = arr2[idx2];
                 idx2++;
                 idx3++;
             }
         }
 
         while(idx1 < arr1.length){
             res[idx3] = arr1[idx1];
                 idx3++;
                 idx1++;
         }
 
         while(idx2 < arr2.length){
             res[idx3] = arr2[idx2];
                 idx2++;
                 idx3++;
         }
 
         return res;
     }
     public int[] sortArray(int[] nums) {
        return mergeSort(nums , 0 , nums.length - 1);
 }
 }


 // Method 2 -> No return type method

 
  
 class Solution2 {
    // Recursive Code (Divide and Conquer)
     public void mergeSort(int[]nums , int l , int r){
          if(l >= r) return ;
          
         int mid = (l + r)/2;
         mergeSort(nums, l, mid);
         mergeSort(nums, mid + 1, r);
 
         merge(nums , l , mid , mid + 1, r);
     }
 
     public void merge(int[] nums ,int l1 , int r1 , int l2 , int r2 ){
         int[] res = new int[r2 - l1 + 1];
         int p1 = l1, p2 = l2, p3 = 0;
 
         while(p1 <= r1 && p2 <= r2){
             if(nums[p1] <= nums[p2]){
                 res[p3] = nums[p1];
                 p3++;
                 p1++;
             }else{
                 res[p3] = nums[p2];
                 p2++;
                 p3++;
             }
         }
 
         while(p1 <= r1){
             res[p3] = nums[p1];
                 p3++;
                 p1++;
         }
 
         while(p2 <= r2){
             res[p3] = nums[p2];
                 p2++;
                 p3++;
         }
 
         for(int idx = l1; idx <= r2; idx++){
             nums[idx] = res[idx - l1];
         }
     }
     public int[] sortArray(int[] nums) {
        mergeSort(nums , 0 , nums.length - 1);
        return nums;
 }
 }