package com.soumik.DS.soumik.DS;

public class CountDig {
    public static void main(String[] args) {
        int n=500;
        int count=countDig( n);
        System.out.println(count);
    }
    static int countDig(int n){
        int dig=0;
        if(n==0){
            return dig;
        }else{
            dig++;
            return countDig(n/10);
        }
    }
}
