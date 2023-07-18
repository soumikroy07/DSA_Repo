package com.soumik.DS.soumik.DS;

public class JobAThon14 {
    public static void main(String[] args) {
        int n = 7;
        int ans = solveG(n);
        System.out.println(ans);
    }

    private static int solveG(int n) {
        if(n == 0) return 0;
        if(n==1) return 1;
        int ans = 0;
        if(n % 2 == 0){
            ans = 1+solveG(n/2);
        }else{
            ans = 1+solveG(n - (n+1)/2);
        }
        return ans;
    }

}
