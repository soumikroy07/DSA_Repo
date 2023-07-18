package com.soumik.DS.soumik.DS;

import java.util.PriorityQueue;

public class Leetcode2577 {
    static int dirs[][] = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public static void main(String[] args) {
        int grid[][] = new int[][]{{0,1,3,2},{5,1,2,5},{4,3,8,6}};
        int ans = minimumTime(grid);
        System.out.println(ans);
    }

    private static int minimumTime(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        if(grid[0][1] > 1 && grid[1][0] > 1){
            return -1;
        }

        boolean visited[][] = new boolean[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)-> a[2] - b[2]);
        pq.add(new int[]{0, 0, 0});

        while(!pq.isEmpty()){
            int curr[] = pq.poll();
            int row = curr[0], col = curr[1], time = curr[2];
            if(row == m - 1 && col == n-1){
                return time;
            }

            if(visited[row][col]){
                continue;
            }

            visited[row][col] = true;
            for(int dir[] : dirs){
                int r = row + dir[0], c = col + dir[1];
                if(r >= m || r < 0 || c >= n || c < 0 || visited[r][c]){
                    continue;
                }
                if(grid[r][c] <= time+1){
                    pq.add(new int[]{r, c, time+1});
                }else{
                    int time_gap = grid[r][c] - time;
                    if(time_gap % 2 == 1){
                        pq.add(new int[]{r, c, grid[r][c]});
                    }else{
                        pq.add(new int[]{r, c, grid[r][c] + 1});
                    }
                }
            }
        }

        return -1;
    }
}
