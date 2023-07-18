package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_biweekly_93 {
    public static void main(String[] args) {
        int vals[] = {1,2,3,4,10,-10,-20};
        int edges[][] = {{0,1},{1,2},{1,3},{3,4},{3,5},{3,6}};
        int k = 2;
        int ans = maxStarSum(vals, edges, k);
        System.out.println(ans);
    }

    private static int maxStarSum(int[] vals, int[][] edges, int k) {
        List<List<P>> adj = new ArrayList<>();

        for (int i = 0; i < vals.length; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int start = edge[0], end = edge[1];
            adj.get(start).add(new P(end, vals[end]));
            adj.get(end).add(new P(start, vals[start]));
        }

        for (List<P> list : adj) {
            Collections.sort(list);
        }

        int max = 0;
        for (List<P> list : adj) {
            int sum = 0;
            for (int i = 0; i < Math.min(list.size(), k); i++) {
                P curr = list.get(i);
                sum += curr.val;
            }
            max = Math.max(max, sum);
        }

        return max;
    }
}
class P implements Comparable<P>{
    int node, val;
    P(int n, int v){
        node = n;
        val = v;
    }

    public int compareTo(P o){
        return o.val - this.val;
    }
}