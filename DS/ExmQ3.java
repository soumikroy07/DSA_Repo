package com.soumik.DS;

import java.lang.Math;
import java.util.*;
public class ExmQ3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m=n,count=0;
        int x=n;
        while (m>0){
            m=m/10;
            count++;
        }
        int res=0;
        while(x>0){
            int rem=x%10;
            res=res+(int)Math.pow(rem,count);
            x=x/10;
        }
        if(n==res){
            System.out.println("amstrong");
        }else{
            System.out.println("not");
        }
    }
}
