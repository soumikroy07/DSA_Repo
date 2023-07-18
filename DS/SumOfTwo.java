package com.soumik.DS;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] arr1={ 6,2,4};
        int[] arr2={7,2,6};
        int[] output= new int[4];
        sumOfTwoArray(arr1,arr2,output);
    }
    static void sumOfTwoArray(int arr1[],int arr2[],int output[]){
        int n=arr1.length;
        int m=arr2.length;
        int x=output.length-1;
        int i=n-1,j=m-1;

        while(i>0 && j>0){
            int res=0;
            int sum=arr1[i]+arr2[j]+res;
            if(sum>9){
                res=1;
                output[x]=sum%10;
            }else {
                res=0;
                output[x]=sum;
            }
            x--;
            i--;
            j--;
        }
        for (int k=0;k<=x;k++){
            System.out.print(output[k]+ " ");
        }
    }
}
