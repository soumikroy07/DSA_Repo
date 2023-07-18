package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG_POTD_17_FEB {
    public static void main(String[] args) {
//        long num[] = new long[]
        ArrayList<Long> geekNum = new ArrayList<>();
        geekNum.add(0L);
        geekNum.add(1L);
        geekNum.add(2L);
//        List<Long> geekNum = Arrays.asList(0L, 1L, 2L);
        long ans = solve(geekNum, 5, 3);
        System.out.println(ans);
    }

    private static long solve(ArrayList<Long> geekNum, int n, int k) {
        long preSum = 0L;
        for(int i=k-1; i >= 0; i--){
            preSum += geekNum.get(i);
        }

        int start = 0;
        geekNum.add(preSum);
        while(k < n){
            preSum += geekNum.get(k);
            k++;
            preSum -= geekNum.get(start++);
            geekNum.add(preSum);
        }
        return geekNum.get(k-1);
    }
}
