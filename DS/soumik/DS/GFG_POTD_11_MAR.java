package com.soumik.DS.soumik.DS;

import java.util.ArrayList;

public class GFG_POTD_11_MAR {
    public static void main(String[] args) {
        int a[] = new int[]{1,1,1,1,1};
        int q[][] = new int[][]{{0,4,2},{0,4,1}};
        ArrayList<Integer> list = solveQueries(a.length, q.length, a, q);
        System.out.println(list);
    }

    private static ArrayList<Integer> solveQueries(int n, int num, int[] a, int[][] qu) {
        int dp[] = new int[n];
        dp[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            for(int j=i+1; j<n; j++){
                if(a[j] == a[i]){
                    dp[i] = dp[j]+1;
                    break;
                }
                dp[i] = 1;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int q[] : qu){
            int start = q[0], end = q[1], k = q[2];
            int count = 0;
            for(int i=start; i<=end; i++){
                if(dp[i] == k){
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }
}
