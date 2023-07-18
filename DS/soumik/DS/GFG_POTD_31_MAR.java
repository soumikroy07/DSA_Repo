package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class GFG_POTD_31_MAR {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 4, 2};
        int ans[] = lexicographicallyLargest(arr, 3);
        for (int i : ans){
            System.out.print(i + " ");
        }
    }

    private static int[] lexicographicallyLargest(int[] arr, int n) {
        int i = 0, j = 1;
        while(j < n){
            if((arr[j] + arr[j-1]) % 2 == 0){
                j++;
            }else{
                int temp[] = build(arr, i, j-1);
                int k = 0;
                Arrays.sort(temp);
                reverse(temp);
                for(int x=i; x<j; x++){
                    arr[x] = temp[k++];
                }
                i = j;
                j++;
            }
        }

        if(i == j-1){
            return arr;
        }else{
            int temp[] = build(arr, i, j-1);
            int k = 0;
            Arrays.sort(temp);
            reverse(temp);
            for(int x=i; x<j; x++){
                arr[x] = temp[k++];
            }
        }
        return arr;
    }

    static int[] build(int arr[], int i, int j){
        int temp[] = new int[j-i+1];
        int k = 0;
        for(int x=i; x<=j; x++){
            temp[k++] = arr[x];
        }
        return temp;
    }

    static 	public void reverse(int[] array)
    {

        // Length of the array
        int n = array.length;

        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half to the last half
            array[i] = array[n - i - 1];

            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }


}
