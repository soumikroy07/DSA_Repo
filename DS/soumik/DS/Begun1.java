package com.soumik.DS.soumik.DS;

import java.util.Scanner;

public class Begun1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for (int a[]: arr){
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
        }


        for (int a[]: arr){
            int row = a[0], col = a[1];
            int k=0;
            int out[][] = new int[row][col];
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    out[i][j] = k++;
                }
            }
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    if(j == col-1){
                        System.out.print(out[i][j]);
                        continue;
                    }
                    System.out.print(out[i][j]+ ",");
                }
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
