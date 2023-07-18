package com.soumik.DS;

import java.util.*;
public class BinarySearchRec {
    public static void main(String[] args) {
        int arr[]={2,3,4,7,8};
        int n= arr.length;

        int x=4;
        int start=0;
        int end=n-1;
        x=BSearch(arr,start,end,x);
        System.out.println(x);
    }
    static int BSearch(int arr[],int start,int end,int x){
        int mid=(start+end)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
            return BSearch(arr,start,mid-1,x);
        }
        else{
            return BSearch(arr,mid+1,end,x);
        }
    }


}
