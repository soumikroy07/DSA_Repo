package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class GFG_POTD_12_APR {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 2,2,1};
        int ans = dominantPairs(arr, arr.length);
        System.out.println(ans);
    }

    private static int dominantPairs(int[] arr, int n) {
        buildF(arr, n);
        buildB(arr, n);

        int i=0, j=n/2, ans = 0;
        while(i < n/2 && j < n){
            if(arr[i] >= 5*arr[j]){
                ans += n - j;
                i++;
            }else{
                j++;
            }
        }
        return ans;
    }

    static void buildF(int arr[], int n){
        int temp[] = new int[n/2];
        for(int i=0; i<n/2; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        reverse(temp, 0 , n/2-1);
        for(int i=0; i<n/2; i++){
            arr[i] = temp[i];
        }
    }

    static void buildB(int arr[], int n){
        int temp[] = new int[n/2];
        for(int i=0; i<n/2; i++){
            temp[i] = arr[i+(n/2)];
        }
        Arrays.sort(temp);
        reverse(temp, 0, n/2 - 1);
        for(int i=0; i<n/2; i++){
            arr[i+(n/2)] = temp[i];
        }
    }

    static void reverse(int arr[], int i,  int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
