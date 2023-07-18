package com.soumik.DS;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(3,'s','h','d');
    }
    public static void toh(int n, char s,char h,char d){
        if(n==1){
            System.out.println("Move 1st disk from "+ s + " to " + d );
            return;
        }
        toh(n-1,s,d,h);
        System.out.println("Move "+ n +"th disk from " + s +" to "+d);
        toh(n-1,h,s,d);
    }
}
