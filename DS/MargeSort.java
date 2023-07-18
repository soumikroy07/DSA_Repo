package com.soumik.DS;

public class MargeSort {
    public static void main(String[] args) {
        int arr[]={2 ,6 ,8 ,5 ,4 ,3};
        margeSortAlgo(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void margeSortAlgo(int arr[],int start ,int end){
        if(start<end){
            int mid=(start+end)/2;
            margeSortAlgo(arr,start,mid);
            margeSortAlgo(arr,mid+1,end);
            marge(arr,start,mid,end);
        }
    }
    public static void marge(int arr[],int start,int mid,int end){
        int n1=mid-start+1;
        int n2=end-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i]=arr[start+i];
        }
        for (int j=0;j<n2;j++){
            arr2[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=start;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k++]=arr[i++];
            }else {
                arr[k++]=arr2[j++];
            }
        }
        while (i<n1){
            arr[k++]=arr1[i++];
        }
        while (j<n2){
            arr[k++]=arr2[j++];
        }
    }
}
