package com.soumik.DS.soumik.DS;

public class Leetcode_biweekly_98_1 {
    public static void main(String[] args) {
        int num = 11891;
        int dif = minMaxDifference(num);
        System.out.println(dif);
    }

    private static int minMaxDifference(int num) {
        int len = getLength(num);
        int arr[] = new int[len];
        getArray(arr, num);
        return 1;
    }

    static int getLength(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
    static void getArray(int arr[], int n){
        int i = arr.length - 1;
        while(n > 0){
            arr[i] = n % 10;
            i--;
            n = n / 10;
        }
    }
}
