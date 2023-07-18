package com.soumik.DS;

import java.util.Scanner;

public class PowerCalculate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int pow= sc.nextInt();
        int res=powerOfNum(num,pow);
        System.out.println(res);
    }
    static int powerOfNum(int n,int p){
        if(p==0){
            return 1;
        }
        else
            return (n*powerOfNum(n,p-1));
    }

}
