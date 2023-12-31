package com.soumik.DS.soumik.DS;

public class GFG_POTS_15_FEB {
    static int dirs[][] = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        int mat[][] = new int[][]{{1,1,1}, {1,1,1}};
        int ans = water_flow(mat, mat.length, mat[0].length);
        System.out.println(ans);
    }

    private static int water_flow(int[][] mat, int m, int n) {
        boolean indian[][] = new boolean[m][n];
        boolean arbian[][] = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((i == 0 || j == 0) && !indian[i][j]){
                    dfs1(mat, i, j, indian);
                }
            }
        }

        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if((i == m-1 || j == n-1) && !arbian[i][j]){
                    dfs2(mat, i, j, arbian);
                }
            }
        }

        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(indian[i][j] && arbian[i][j]){
                    count ++;
                }
            }
        }
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                System.out.print(indian[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                System.out.print(arbian[i][j] + " ");
//            }
//            System.out.println();
//        }
        return count;
    }

    static void dfs1(int mat[][], int i, int j, boolean indian[][]){

        indian[i][j] = true;
        for(int dir[] : dirs){
            int new_i = i + dir[0];
            int new_j = j + dir[1];
            if(new_i < 0 || new_i >= mat.length || new_j < 0 || new_j >= mat[0].length || indian[new_i][new_j] || mat[new_i][new_j] < mat[i][j]){
                continue;
            }

            dfs1(mat, new_i, new_j, indian);
        }
    }

    static void dfs2(int mat[][], int i, int j, boolean arbian[][]){

        arbian[i][j] = true;
        for(int dir[] : dirs){
            int new_i = i + dir[0];
            int new_j = j + dir[1];
            if(new_i < 0 || new_i >= mat.length || new_j < 0 || new_j >= mat[0].length || arbian[new_i][new_j] || mat[new_i][new_j] < mat[i][j]){
                continue;
            }

            dfs2(mat, new_i, new_j, arbian);
        }
    }
}
