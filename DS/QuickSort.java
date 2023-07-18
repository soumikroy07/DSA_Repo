package com.soumik.DS;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={2 ,6 ,8 ,5 ,4 ,3};
        quickort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void quickort(int arr[],int start,int end){
        if(start<end){
            int p=LPartition(arr,start,end);
            quickort(arr,start,p-1);
            quickort(arr,p+1,end);
        }
    }
    public static int LPartition(int arr[],int start,int end){
        int i=start-1;
        int pivot=arr[end];
        for(int j=start;j<=end-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}