package com.soumik.DS.soumik.DS;

import java.util.Scanner;

public class ExmQ2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print("0");
                }
            }
            for(int k=0;k<1;k++){
                System.out.print("*");
            }
            for(int j=n;j>=1;j--){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
