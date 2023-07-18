package com.soumik.DS.soumik.DS;

public class Leetcode221 {
    public static void main(String[] args) {
        char matrix[][] = {{'1','1','1'},
                {'1','1','1'},
                {'1','1','0'}};
        int ans = maximalSquare(matrix);
        System.out.println(ans);
    }

    public static int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int dp[][] = new int[m][n];
        int ans = 0;
        for(int i=0; i<m; i++){
            dp[i][0] = (matrix[i][0] == '1') ? 1 : 0;
        }
        for(int i=0; i<n; i++){
            dp[0][i] = (matrix[0][i] == '1') ? 1 : 0;
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j] == '1'){
                    dp[i][j] = Math.min(matrix[i-1][j-1],
                            Math.min(matrix[i][j-1], matrix[i-1][j]));
                    ans = Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        return ans;
    }
}
