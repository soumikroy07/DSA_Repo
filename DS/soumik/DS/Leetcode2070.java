package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode2070 {
    public static void main(String[] args) {
        int items[][] = new int[][]{{10,1000}};
        int[] queries = new int[]{5};
        int ans[] = maximumBeauty(items, queries);
        for (int a : ans){
            System.out.print(a + " ");
        }
    }

    private static int[] maximumBeauty(int[][] items, int[] queries) {
        int n = queries.length;
        int ans[] = new int[n];
        Arrays.sort(items, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int maxBeauty[] = new int[items.length], max = 0;

        for (int i=0; i<items.length; i++){
            max = Math.max(max, items[i][1]);
            maxBeauty[i] = max;
        }

        for (int i=0; i<queries.length; i++){
            int idx = getIdx(items, queries[i]);
            ans[i] = maxBeauty[idx];
        }
        return ans;
    }

    private static int getIdx(int[][] items, int query) {
        int low = 0, high = items.length-1, ans = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if(items[mid][0] <= query){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}
