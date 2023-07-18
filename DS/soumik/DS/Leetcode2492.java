package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2492 {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[][] roads = new int[][]{{1,2,9},{2,3,6},{2,4,5},{1,4,7}};
        int ans = minScore(4, roads);
        System.out.println(ans);
    }

    private static int minScore(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();

        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0; i< roads.length; i++){
            adj.get(roads[i][0]).add(new int[]{roads[i][1], roads[i][2]});
        }

        boolean visited[] = new boolean[n+1];

        dfs(1, adj, visited, n);

        return min;
    }

    static void dfs(int node, List<List<int[]>> adj, boolean visited[], int n){
        visited[node] = true;
        for(List<int[]> list: adj){
            for(int[] neighbour : list){
                int next = neighbour[0], dist = neighbour[1];
                if(!visited[next]){
                    min = Math.min(min, dist);
                    dfs(next, adj, visited, n);
                }
            }
        }
        visited[node] = false;
    }
}
