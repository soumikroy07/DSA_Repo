package com.soumik.DS;

public class Sequence {
    public static void main(String[] args) {
        boolean ans= checkSequence("abcde","aeb");
        System.out.println(ans);
    }
    public static boolean checkSequence(String a, String b){
        int m=a.length();
        int n=b.length();
        int i=0,j=0;
        while (i<m && j<n){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }else {
                i++;
            }
        }
        if(j==n){
            return true;
        }else {
            return false;
        }
    }
}
