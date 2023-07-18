package com.soumik.DS;

public class Pattern {
    public static void main(String[] args) {
        int nsp = 2;
        int nst = 1;
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < (n / 2 + 1)) {
                nsp--;
                nst = nst + 2;
            } else {
                nsp++;
                nst = nst - 2;
            }
        }


    }


}
