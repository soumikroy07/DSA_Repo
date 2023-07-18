package com.soumik.DS.soumik.DS;

public class Leetcode1277 {
    public static void main(String[] args) {
        int matrix[][] = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        int ans = countSquares(matrix);
        System.out.println(ans);
    }
    public static int countSquares(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int dp[][] = new int[m][n];

        for(int i=0; i<m; i++){
            if(matrix[i][0] == 1) dp[i][0] = 1;
        }

        for(int j=1; j<n; j++){
            dp[0][j] = matrix[0][j] == 1 ? 1 : 0;
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j] == 1){
                    dp[i][j] = 1+Math.min(dp[i-1][j-1],
                            Math.min(dp[i][j-1], dp[i-1][j]));
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                count += dp[i][j];
            }
        }

        return count;
    }
}
