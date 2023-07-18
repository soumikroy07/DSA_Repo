package com.soumik.DS.soumik.DS;

import java.util.Collections;
import java.util.PriorityQueue;

public class GFG_POTD_15_NOV {
    public static void main(String[] args) {
        int arr[] = {5, 4, 5, 5, 6, 7, 8, 8, 8, 7, 6};
        int ans = longestPerfectPiece(arr, 11);
        System.out.println(ans);
    }

    private static int longestPerfectPiece(int[] arr, int n) {
        // code here
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;
        for(int i=0,j=0; i<n; i++){
            max.add(arr[i]);
            min.add(arr[i]);

            while(j < n && max.peek() - min.peek() > 1){
                max.remove(arr[j]);
                min.remove(arr[j]);
                j++;
            }

            ans = Math.max(ans, i-j+1);
        }

        return ans;
    }
}
