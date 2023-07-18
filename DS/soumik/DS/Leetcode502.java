package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode502 {
    public static void main(String[] args) {
        int profits[] = new int[]{1,2,3};
        int capital[] = new int[]{0, 1, 2};
        int ans = findMaximizedCapital(20, 0, profits, capital);
        System.out.println(ans);
    }

    private static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = capital.length;
        int ipo[][] = new int[n][2];
        for(int i=0; i<n; i++){
            ipo[i][0] = profits[i];
            ipo[i][1] = capital[i];
        }

        Arrays.sort(ipo, (a, b) -> a[1] - b[1]);
        int profit = 0, max = Integer.MIN_VALUE;
        int i = 0;
        while(i < n && k-- > 0){
            while(i < n && w >= ipo[i][1]){
                max = Math.max(ipo[i][0], max);
                i++;
            }
            profit += max;
            w += max;
//            i++;
        }
        return profit;
    }
}
