package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.List;

public class Leetcode997 {
    public static void main(String[] args) {
        int n = 3;
        int trust[][] = {{1,2}, {2,3}};
        int ans = findJudge(n, trust);
        System.out.println(ans);
    }

    private static int findJudge(int n, int[][] trust) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }

        for(int t[] : trust){
            adj.get(t[0]).add(t[1]);
        }

        for(int i=1; i<=n; i++){
            if(adj.get(i).size() == 0){
                return i;
            }
        }

        return -1;
    }
}
