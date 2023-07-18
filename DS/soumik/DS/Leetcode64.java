package com.soumik.DS.soumik.DS;

public class Leetcode64 {
    public static void main(String[] args) {
        int grid[][] = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        int ans = minPathSum(grid);
        System.out.println(ans);
    }
    static int dirs[][] = new int[][]{{1, 0}, {0, 1}};
    static boolean visited[][];
    static int res;
    private static int minPathSum(int[][] grid) {
        res = Integer.MAX_VALUE;
        int m = grid.length, n = grid[0].length;
        visited = new boolean[m][n];
        dfs(grid, 0, 0, 0);
        return res;
    }

    private static void dfs(int[][] grid, int i, int j, int sum) {
        if(i == grid.length-1 && j == grid[0].length-1){
            res = Math.min(sum+grid[i][j], res);
            return;
        }
        for(int dir[] : dirs){
            int row = dir[0]+i, col = dir[1]+j;
            if(row>=grid.length || col>=grid[0].length || visited[row][col]){
                continue;
            }
            visited[row][col] = true;
            dfs(grid, row, col, sum+grid[row][col]);
        }
    }
}
