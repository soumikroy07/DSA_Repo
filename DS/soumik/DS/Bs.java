package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Bs {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,0,1,2,3};
        Arrays.sort(arr);
        int x = find(arr , 5);
        System.out.println(x);
    }

    private static int find(int[] arr, int target) {
        int l = 0, h = arr.length - 1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(target == arr[mid]){
                return mid;
            }else if(arr[mid] > arr[h] && arr[h] > target){
                l = mid+1;
            }else{
                h = mid - 1;
            }
        }

        return -1;
    }

}
