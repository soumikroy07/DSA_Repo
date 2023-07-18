package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode_weekly_339_3 {
    public static void main(String[] args) {
        int reward1[] = new int[]{2,1};
        int reward2[] = new int[]{1,2};
        int ans = miceAndCheese(reward1, reward2, 1);
        System.out.println(ans);
    }

    static int ans = 0;
    static int dp[][];
    private static int miceAndCheese(int[] reward1, int[] reward2, int k) {
//        dp = new int[reward1.length][k];
//        for(int a[] : dp){
//            Arrays.fill(a, -1);
//        }
//        help(reward1, reward2, k, 0, 0);

        int arr[][] = new int[reward1.length][2];
        for (int i=0; i<reward1.length; i++){
            arr[i][0] = reward1[i] - reward2[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b)-> b[0] - a[0]);

        int total = 0;
        for(int i=0; i<k; i++){
            total += reward1[arr[i][1]];
        }
        for (int i=k; i< reward1.length; i++){
            total += reward2[arr[i][1]];
        }

        return total;
    }

    static void help(int[] reward1, int[] reward2, int k, int i, int val){
        if(k == 0){
            ans = Math.max(val, ans);
            return;
        }

        if(k < 0 || i>= reward1.length){
            return;
        }

        help(reward1, reward2, k-1, i+1, val+reward1[i]);
        help(reward1, reward2, k, i+1, val+reward2[i]);
    }
}
