package com.soumik.DS.soumik.DS;

public class Leetcode_weekly_345_3 {
    public static void main(String[] args) {
        int grid[][] = new int[][]{{2,4,3,5},{5,4,9,3},{3,4,2,11},{10,9,13,15}};
        int ans = maxMoves(grid);
        System.out.println(ans);
    }

    static int dirs[][] = new int[][]{{-1, 1}, {0, 1}, {1, 1}};
    static int ans = 0;
    public static int maxMoves(int[][] grid) {


        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];

        int[] dir = {-1, 0, 1};

        for (int j = n - 2; j >= 0; j--) {
            for (int i = 0; i < m; i++) {
                for (int x : dir) {
                    if (x + i >= 0 && x + i < m && grid[i][j] < grid[i + x][j + 1]) {
                        dp[i][j] = Math.max(dp[i][j], 1 + dp[i + x][j + 1]);
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            ans = Math.max(ans, dp[i][0]);
        }
        return ans;

//        int m = grid.length, n = grid[0].length;
//        if(m == 1){
//            int count = 0;
//            for(int i=1; i<n; i++){
//                if(grid[0][i-1] < grid[0][i]){
//                    count++;
//                }
//                else{
//                    count = 0;
//                }
//                ans = Math.max(count, ans);
//            }
//            return ans;
//        }
//        int dp[][] = new int[m][n];
//        for(int j=0; j<n; j++){
//            dp[0][j] = 0;
//        }
//        for(int i=0; i<m; i++){
//            for(int j=1; j<n; j++){
//                if(i == 0){
//                    if(grid[i][j] > grid[i][j-1]){
//                        dp[i][j] = Math.max(dp[i][j-1]+1, dp[i][j]);
//                    }
//                    if(grid[i][j] > grid[i+1][j-1]){
//                        dp[i][j] = Math.max(dp[i+1][j-1] + 1, dp[i][j]);
//                    }
//                }else if(i == n-1){
//                    if(grid[i][j] > grid[i][j-1]){
//                        dp[i][j] = Math.max(dp[i][j-1]+1, dp[i][j]);
//                    }
//                    if(grid[i][j] > grid[i-1][j-1]){
//                        dp[i][j] = Math.max(dp[i-1][j-1] + 1, dp[i][j]);
//                    }
//                }else{
//                    if(grid[i][j] > grid[i][j-1]){
//                        dp[i][j] = Math.max(dp[i][j-1]+1, dp[i][j]);
//                    }
//                    if(grid[i][j] > grid[i+1][j-1]){
//                        dp[i][j] = Math.max(dp[i+1][j-1] + 1, dp[i][j]);
//                    }
//                    if(grid[i][j] > grid[i-1][j-1]){
//                        dp[i][j] = Math.max(dp[i-1][j-1] + 1, dp[i][j]);
//                    }
//                }
//            }
//        }
//
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                ans = Math.max(dp[i][j], ans);
//            }
//        }
//        return ans;





//        solve(grid, 0 , 0 , 0);
//        return ans;
    }

    static void solve(int grid[][], int i, int j, int count){


        for(int dir[]: dirs){
            int _x = i+dir[0], _y = j+dir[1];
            if(_x >= grid.length || _y >= grid[0].length || _x < 0 || _y < 0){
                ans = Math.max(ans, count);
                continue;
            }
            if(grid[_x][_y] < grid[i][j]){
                ans = Math.max(ans, count);
                continue;
            }
            solve(grid, _x, _y, count+1);
        }
    }
}
