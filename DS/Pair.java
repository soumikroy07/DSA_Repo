package com.soumik.DS;

import java.util.Arrays;

public class Pair {
    public static void main(String[] args) {
        int arr[]={ 1 ,3 ,6 ,2 ,5 ,4 ,3 ,2 ,4};
        int k=12;
        findpair(arr,k);
    }
    static void findpair(int arr[],int sum){
        Arrays.sort(arr);
        int i=0,j= arr.length-1;
        int count=0;
        while(i<j){
            if(arr[i]+arr[j]==sum ){
                count++;
                if(arr[i]==arr[i+1]){
                    i++;
                }
                else if(arr[j]==arr[j-1]){
                    j--;
                }else{
                    i++;
                    j--;
                }
            }
            else if(arr[i]+arr[j]<sum)
                i++;
            else {
                j--;
            }
        }
        System.out.println(count);
    }
}

