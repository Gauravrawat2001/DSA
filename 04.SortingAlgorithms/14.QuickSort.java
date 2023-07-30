// LC - Sort an Array , time -> avg = O(n Log n), worst = O(N^2) , Space -> Recursive Space - O(LogN)

class Solution {

    public void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int partition(int[] nums , int left ,int right){
        int pivot = nums[right];
        int i = left , j = left;

        while(j <= right){
            if(nums[j] <= pivot){
                swap(nums , i , j);
                i++; j++;
            }else{
                j++;
            }
        }

        return i - 1;
    }

    public void quickSort(int[] nums , int left ,int  right){
        if(left >= right) return; // base case array size 0 or 1

        int mid = partition(nums , left , right); // preOrder Work
        quickSort(nums , left , mid - 1); //left recursive sort
        quickSort(nums , mid + 1 , right); // right recursive sort

    }
    public int[] sortArray(int[] nums) {
        quickSort(nums , 0 , nums.length - 1);
        return nums;
    }
}