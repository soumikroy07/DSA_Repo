package com.soumik.DS;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);

        int arr[]= {5 ,3 ,1 ,5, 1, 3, 4, 7, 4, 8, 8  };
        int n=arr.length;
        int x=findUnique(arr);
        System.out.println(x);
    }

    static int findUnique(int arr[]){
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        int min=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        int arr1[]=new int[min+1];
        for(int i=0;i<n;i++){
            arr1[arr[i]]++;
        }
        for(int i=0;i<(min+1);i++){
            if(arr1[i]==1){
                return i;
            }
        }
        return -1;
    }

}
