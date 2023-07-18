package com.soumik.DS.soumik.DS;

public class GFG_POTD_02_NOV {
    public static void main(String[] args) {
        int m =2, n=2, k=1, enemy[][] = new int[][]{{2, 2}};
        int ans = largestArea(m, n, k, enemy);
        System.out.println(ans);
    }

    private static int largestArea(int m, int n, int k, int[][] enemy) {
        int mat[][] = new int[m][n];

        for(int[] e : enemy){
            int row = e[0]-1, col = e[1]-1;

            for(int c=0; c<n; c++){
                mat[row][c] = 1;
            }

            for(int r=0; r<m; r++){
                mat[r][col] = 1;
            }
        }

        int ans = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 0){
                    ans++;
                }
            }
        }

        return ans;
    }
}
