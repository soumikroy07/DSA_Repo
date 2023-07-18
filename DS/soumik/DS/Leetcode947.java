package com.soumik.DS.soumik.DS;

import java.util.HashSet;
import java.util.Set;

public class Leetcode947 {
    public static void main(String[] args) {
        int stones[][] = new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
        int ans = removeStones(stones);
        System.out.println(ans);
    }

    private static int removeStones(int[][] stones) {
        Set<int[]> visited = new HashSet();
        int numOfIslands = 0;
        for (int[] s1:stones){
            if (!visited.contains(s1)){
                dfs(s1, visited, stones);
                numOfIslands++;
            }
        }
        return stones.length - numOfIslands;
    }

    private static void dfs(int[] s1, Set<int[]> visited, int[][] stones){
        visited.add(s1);
        for (int[] s2: stones){
            if (!visited.contains(s2)){
                // stone with same row or column. group them into island
                if (s1[0] == s2[0] || s1[1] == s2[1])
                    dfs(s2, visited, stones);
            }
        }
    }
}
