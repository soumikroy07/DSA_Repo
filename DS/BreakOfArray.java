package com.soumik.DS;

import java.util.*;
public class BreakOfArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,6,8,1};
        int x=breakIndex(arr);
        System.out.println(x);
    }
    static int breakIndex(int arr[]){
        int start=0, end=arr.length-1;

        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[end] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[end] && arr[mid]<arr[mid+1]){
                start=mid+1;
            }else if(arr[mid]<arr[end] && arr[mid]<arr[mid-1]){
                return mid-1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }

}
