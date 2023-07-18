package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode_weekly_340_1 {
    public static void main(String[] args) {
        int nums[][] = new int[][]{{1,2,3}, {5,6,7}, {9, 10, 11}};
        int ans = diagonalPrime(nums);
        System.out.println(ans);
    }

    private static int diagonalPrime(int[][] nums) {
        int max = 0;
        for(int n[]: nums){
            for(int num: n){
                max = Math.max(num, max);
            }
        }

        boolean prime[] = new boolean[max+1];
        Arrays.fill(prime, true);
        for(int i=2; i<prime.length; i++){
            for(int j=i*i; j<prime.length; j+=i){
                if(prime[j]){
                    prime[j] = false;
                }
            }
        }


        // int i=0, j=0;
        int res = 0;
        for(int i=0,j=0; i<nums.length && j<nums.length; i++,j++){
            if(prime[nums[i][j]]){
                res = Math.max(res, nums[i][j]);
            }
        }

        for(int i=0,j=nums.length-1; i<nums.length && j>=0; i++,j--){
            if(prime[nums[i][j]]){
                res = Math.max(res, nums[i][j]);
            }
        }

        return res;
    }
}
