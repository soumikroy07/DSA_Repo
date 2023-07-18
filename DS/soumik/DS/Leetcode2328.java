package com.soumik.DS.soumik.DS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode2328 {
    public static void main(String[] args) {
        int grid[][] = new int[][]{{1, 1}, {3, 4}};
        int ans = countPaths(grid);
        System.out.println(ans);
    }

    private static int countPaths(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int d[]: dp){
            Arrays.fill(d, 1);
        }

        int max_i = -1, max_j = -1, max = Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(max < grid[i][j]){
                    max = grid[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        int dirs[][] = new int[][]{{0,1}, {0,-1}, {1,0}, {-1, 0}};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{max_i, max_j});

        while(!q.isEmpty()){
            int idx[] = q.poll();
            int i = idx[0], j=idx[1];
            for(int dir[]: dirs){
                int new_i = i+dir[0], new_j = j+dir[1];
                if(new_i < 0 || new_j < 0 || new_i >= m || new_j >= n || grid[i][j] <= grid[new_i][new_j]){
                    continue;
                }
                dp[new_i][new_j] += dp[i][j];
                q.add(new int[]{new_i, new_j});
            }
        }

        int ans = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans += dp[i][j];
            }
        }
        return ans;
    }
}
