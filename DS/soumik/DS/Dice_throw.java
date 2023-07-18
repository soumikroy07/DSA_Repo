package com.soumik.DS.soumik.DS;

public class Dice_throw {
    public static void main(String[] args) {
        int n = 3;
        int ans = noOfWays(n);
        System.out.println(ans);
    }

    private static int noOfWays(int n) {
        if(n < 0){
            return 0;
        }

        if(n == 0){
            return 1;
        }
        int count = 0;
        for (int i=1; i<=Math.min(6, n); i++){
            count += noOfWays(n - i);
//            count += noOfWays(n);
        }
        return count;
    }
}
