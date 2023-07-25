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
