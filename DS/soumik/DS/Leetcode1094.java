package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode1094 {
    public static void main(String[] args) {
        int trips[][] = new int[][] {{3,5,9},{4,2,5},{3,4,6},{9,1,4},{5,6,8},{5,4,6}}, capacity = 14;
        boolean ans = carPooling(trips, capacity);
        System.out.println(ans);
    }

    private static boolean carPooling(int[][] trips, int capacity) {
        int n = trips.length;
        int pick[][] = new int[n][2];
        int drop[][] = new int[n][2];

        for(int i=0; i<n; i++){
            pick[i][0] = trips[i][1];
            pick[i][1] = trips[i][0];
            drop[i][0] = trips[i][2];
            drop[i][1] = trips[i][0];
        }

        int i=0, j = 0;
        Arrays.sort(pick, (a, b) -> a[0] - b[0]);
        Arrays.sort(drop, (a, b) -> a[0] - b[0]);
        int passenger = 0;
        while(i < n && j < n){
            if(pick[i][0] < drop[j][0]){
                passenger += pick[i][1];
                if(passenger > capacity){
                    return false;
                }
                i++;
            }else{
                passenger -= drop[j][1];
                j++;
            }
        }

        return true;
    }
}
