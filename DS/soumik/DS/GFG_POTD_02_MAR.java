package com.soumik.DS.soumik.DS;

public class GFG_POTD_02_MAR {
    public static void main(String[] args) {
        int costs[][] = new int[][]{{1, 5, 7},
                {5, 8, 4},
                {3, 2, 9},
                {1, 2, 4}};
        int ans = minCost(costs);
        System.out.println(ans);
    }

    private static int minCost(int[][] costs) {
        int m = costs.length, n = costs[0].length;
        if(n == 1){
            return -1;
        }
        int dp[][] = new int[m][n];

        for(int j=0; j<n; j++){
            dp[0][j] = costs[0][j];
        }

        for(int i=1; i<m; i++){
            for(int j=0; j<n; j++){
                int min = Integer.MAX_VALUE;
                for(int k=0; k<n; k++){
                    if(j == k){
                        continue;
                    }
                    min = Math.min(min, dp[i-1][k]);
                }
                dp[i][j] = min + costs[i][j];
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int j=0; j<n; j++){
            ans = Math.min(dp[m-1][j], ans);
        }
        return ans;
    }
}
