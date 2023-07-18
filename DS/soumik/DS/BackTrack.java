package com.soumik.DS.soumik.DS;

public class BackTrack {
//    static int count = 0;
    static int dirs[][] = {{1,0}, {-1,0}, {0, 1}, {0, -1}};
    public static void main(String[] args) {
        int[][] board = new int[][] {{1,1,1}, {1,0,1}, {1,1,1}};
        int n = board.length;
        int ans = hasPath(board, 0, 0, n-1, n-1);
        System.out.println(ans);
    }

    static boolean visited[][];
    private static int hasPath(int[][] board, int si, int sj, int di, int dj) {
        int n = board.length;
        int count[] = new int[1];
        visited = new boolean[n][n];
        return available(board, si, sj, di, dj, count);
    }

    private static int available(int[][] board, int si, int sj, int di, int dj, int count[]) {
        if(si < 0 || si >= board.length || sj < 0 || sj >= board.length){
            return 0;
        }
        if(board[si][sj] == 0 || /*visited[si][sj] */  board[si][sj] == -1 ){
            return 0;
        }

        if(si == di && sj == dj) return count[0]++;

//        visited[si][sj] = true;
        board[si][sj] = -1;

        for(int[] dir : dirs){
            available(board, si+dir[0], sj+dir[1], di, dj, count) ;
        }

//        visited[si][sj] = false;
        board[si][sj]  = 1;
        return count[0];
    }
}

//1,1,1
//1,0,1
//0,1,1