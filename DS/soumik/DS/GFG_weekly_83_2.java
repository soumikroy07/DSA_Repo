package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class GFG_weekly_83_2 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 1, 3};
        int k = 3;
        long ans = diffInTaste(arr.length, k, arr);
        System.out.println(ans);
    }

    private static long diffInTaste(int n, int k, int arr[]) {
        if(n == 1){
            return 0L;
        }
        int adj[] = new int[n-1];
        for(int i=0; i<n-1; i++){
            adj[i] = arr[i] + arr[i+1];
        }

        Arrays.sort(adj);
        long min = 0, max = 0;
        for(int i=0; i<k-1; i++){
            min += (long)adj[i];
        }

        int i = adj.length-1;
        while(k > 1){
            max += (long) adj[i--];
            k--;
        }

        return max - min;
    }
}
