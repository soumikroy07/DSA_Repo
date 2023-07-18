package com.soumik.DS.soumik.DS;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[]={1,4,9,3,2};
        int ans=eIndex(arr);
        System.out.println(ans);
    }
    public static int eIndex(int arr[]){
        int fSum=arr[0];
        int lSum=0;
        for (int i=2;i<arr.length;i++){
            lSum+=arr[i];
        }
        int i=1;
        while (i< arr.length-1){
            if(fSum==lSum){
                return i;
            }else {
                fSum+=arr[i];
                lSum=lSum-arr[i+1];
                i++;
            }
        }
        return -1;
    }
}
