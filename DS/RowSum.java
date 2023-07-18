package com.soumik.DS;

public class RowSum {
    public static void main(String[] args) {
        int [][] arr= {{}};
        rowWiseSum(arr);

    }
    static void rowWiseSum(int arr[][]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=+arr[i][j];
            }
            System.out.println(arr);
        }
    }
}
