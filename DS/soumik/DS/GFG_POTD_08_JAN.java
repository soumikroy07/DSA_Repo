package com.soumik.DS.soumik.DS;

import java.util.HashMap;
import java.util.Map;

public class GFG_POTD_08_JAN {
    public static void main(String[] args) {
        int arr[] = {3, 7 , 11}, k = 4;
        long ans = countPairs(arr, k);
        System.out.println(ans);
    }

    private static long countPairs(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a: arr){
            map.put(a % k, map.getOrDefault((a % k), 0)+1);
        }

        long ans = 0L;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            ans += getSum((long)m.getValue());
        }

        return ans;
    }

    private static long getSum(long n) {
        return (n * (n-1)) / 2;
    }
}
