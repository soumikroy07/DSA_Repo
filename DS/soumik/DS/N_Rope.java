package com.soumik.DS.soumik.DS;

import java.util.PriorityQueue;

public class N_Rope {
    public static void main(String[] args) {
        long[] arr = new long[]{4,3,2,6};
        long ans = minCost(arr);
        System.out.println(ans);
    }

    private static long minCost(long[] arr) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long i : arr){
            pq.add(i);
        }
        long cost = 0;

        while(pq.size() != 1){
            long size1 = pq.poll();
            long size2 = pq.poll();
            long size = size1+size2;
            cost = cost+size;
            pq.add(size);
        }

        return cost;
    }
}
