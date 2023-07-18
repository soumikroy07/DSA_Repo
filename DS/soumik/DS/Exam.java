package com.soumik.DS.soumik.DS;

import java.util.ArrayList;

public class Exam {
    public static void main(String[] args) {
        singleDigPrime(10,20);
    }
    public static void singleDigPrime(int a,int b){
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                arr.add(i);
            }
        }

        for(int i=0;i<arr.size();i++){
            int x=arr.get(i);
            while (true) {
                 x = primedig(x);
                 if(x<10){
                     break;
                 }
            }
            if( isPrime(x)){
                System.out.println(arr.get(i));
            }
        }
    }
    public static boolean isPrime(int x){
        int count=0;
        if(x<=1){
            return false;
        }
        for(int i=2;i<=x/2;i++){
            if(x%i==0){
                count++;
                break;
            }
        }
        if (count==0){
            return true;
        }else {
            return false;
        }
    }
    public static int primedig(int x){

        if(x<10){
            return x;
        }else{
            return (x%10)+primedig(x/10);
        }
    }
}
