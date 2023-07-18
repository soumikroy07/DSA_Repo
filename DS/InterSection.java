package com.soumik.DS;

import java.util.Arrays;

public class InterSection {
    public static void main(String[] args) {
        int arr1[]={2, 6, 8, 5, 4, 3};
        int arr2[]={ 2 ,3 ,4 ,7 };
        intersection(arr1,arr2);
    }
    public static void intersection(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int m=arr1.length;
        int n= arr2.length;
        int i=0,j=0;
        while (i<m && j<n){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else {
                i++;
            }
        }
    }
}
