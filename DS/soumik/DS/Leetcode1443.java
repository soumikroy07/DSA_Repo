package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1443 {
    public static void main(String[] args) {
        int edges[][] = {{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}}, n = 7;
        Boolean arr[] = new Boolean[]{false,false,true,false,true,true,false};
        List<Boolean> hasApple = Arrays.asList(arr);
        int ans = minTime(n, edges, hasApple);
        System.out.println(ans);
    }

    private static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int edge[] : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int dist[] = new int[1];
        boolean visited[] = new boolean[n];
        dfs(adj, 0, dist, hasApple, visited, 0);
        return dist[0];
    }

    private static void dfs(List<List<Integer>> adj, int src, int[] dist, List<Boolean> hasApple, boolean[] visited, int path) {
        if(hasApple.get(src)){
            dist[0] += path;
            path = 0;
        }

        visited[src] = true;

        for(int neighbour : adj.get(src)){
            if(!visited[neighbour]){
                dfs(adj, neighbour, dist, hasApple, visited, path+2);
            }
        }
        visited[src] = false;
    }
}
