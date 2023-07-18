package com.soumik.DS.soumik.DS;

public class BackTracking {


    public static void main(String[] args) {
        int[][] board = new int[][] {{1,1,1}, {1,0,1}, {0,1,1}};
        int n = board.length;
        boolean ans = hasPath(board, 0, 0, n-1, n-1);
        System.out.println(ans);
    }

    static boolean visited[][];
    private static boolean hasPath(int[][] board, int si, int sj, int di, int dj) {
        int n = board.length;
        visited = new boolean[n][n];
        return available(board, si, sj, di, dj);
    }

    private static boolean available(int[][] board, int si, int sj, int di, int dj) {
        if(si < 0 || si >= board.length || sj < 0 || sj >= board.length){
            return false;
        }
        if(board[si][sj] == 0 || /*visited[si][sj] */  board[si][sj] == -1 ){
            return false;
        }

        if(si == di && sj == dj) return true;

//        visited[si][sj] = true;
        board[si][sj] = -1;
        if(available(board, si+1, sj, di, dj) ||
            available(board, si-1, sj, di, dj) ||
                available(board, si, sj+1, di, dj)||
                    available(board, si, sj-1, di, dj)) {
            return true;
        }

//        visited[si][sj] = false;
        board[si][sj]  = 1;
        return false;
    }
}


//1,1,1
//1,0,0
//0,1,1