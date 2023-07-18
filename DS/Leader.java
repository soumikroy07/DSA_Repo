package com.soumik.DS;

public class Leader {
    public static void main(String[] args) {
        int arr[]={3,12,34,2,0,-1};
        findLeaders(arr);
    }
    static void findLeaders(int arr[]){
        for(int i=0;i<(arr.length-1);i++){
            if(arr[i]>=arr[i+1]){
                System.out.println(arr[i]);
            }else {
                continue;
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}
