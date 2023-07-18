package com.soumik.DS.soumik.DS;

public class Large {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4}, k = 2;
        int x = findKthLargest(arr , k);
        System.out.println(x);
    }
    public static int findKthLargest(int[] nums, int k) {

        int pos = nums.length - k;
        return kthLargest(nums, pos);
    }

    static int kthLargest(int arr[], int pos){
        int high = arr.length - 1, low = 0, kth=0;
        while(true){
            int pivot = lPartition(arr, low, high);
            if(pivot == pos){
                kth = arr[pivot];
                break;
            }else if(pivot > pos){
                high = pivot - 1;
            }else{
                low = pivot + 1;
            }
        }
        return kth;
    }

    static int lPartition(int arr[], int low, int high){
        int pivot = arr[high];
        int i= low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
