package com.soumik.DS;

public class Marge {
    public static void main(String[] args) {
        int arr[]={1 ,3 ,6 ,11 ,12 ,17};
        int d=4;
        end0(arr,d);
    }
    static void end0(int arr[],int d){
        int n= arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int a=0;a<n;a++){
            System.out.print(arr[a] +" ");
        }
    }
    static void reverse(int arr[],int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
            low++;
        }
    }

}
