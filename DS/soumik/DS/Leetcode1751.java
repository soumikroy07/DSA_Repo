package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode1751 {
    public static void main(String[] args) {
        int events[][] = new int[][]{{1,1,1},{2,2,2},{3,3,3},{4,4,4}};
        int ans = maxValue(events, 3);
        System.out.println(ans);
    }

    private static int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        return helper(events, 0, 0, k);
    }
    public static int helper(int events[][], int i, int end, int k){
        if(i == events.length){
            return 0;
        }

        int ans = 0;
        if(end < events[i][0] && k > 0){
            int ans1 = helper(events, i+1, events[i][1], --k) + events[i][2];
            int ans2 = helper(events, i+1, end, k);
            ans += Math.max(ans1, ans2);
        }else if(end >= events[i][0]){
            ans += helper(events, i+1, end, k);
        }

        return ans;
    }
}
