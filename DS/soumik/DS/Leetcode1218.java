package com.soumik.DS.soumik.DS;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1218 {
    public static void main(String[] args) {
        int arr[] = new int[]{4,12,10,0,-2,7,-8,9,-9,-12,-12,8,8};
        int ans = longestSubsequence(arr, 0);
        System.out.println(ans);
    }

    private static int longestSubsequence(int[] arr, int diff) {
        Map<Integer, Integer> map = new HashMap<>();

        int las = 1;
        map.put(arr[0], 1);

        for(int i=1; i<arr.length; i++){
            int val = arr[i] - diff;
            int value = map.getOrDefault(val, 0)+1;
            las = Math.max(value, las);
            map.put(arr[i], value);
        }

        return las;
    }
}
