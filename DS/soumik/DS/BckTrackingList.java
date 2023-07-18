package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.List;

public class BckTrackingList {
    public static void main(String[] args) {
        int[][] board = new int[][] {{1,1,1}, {1,0,1}, {1,1,1}};
        int n = board.length;
        List<String> ans = hasPath(board, 0, 0, n-1, n-1);
        System.out.println(ans);
    }

    static boolean visited[][];
    private static List<String> hasPath(int[][] board, int si, int sj, int di, int dj) {
        int n = board.length;
        int count[] = new int[1];
        visited = new boolean[n][n];
        List<String> list = new ArrayList<>();
        available(board, si, sj, di, dj, list, "");
        return list;
    }

    private static void available(int[][] board, int si, int sj, int di, int dj, List<String> list, String str) {
        if(si < 0 || si >= board.length || sj < 0 || sj >= board.length){
            return ;
        }
        if(board[si][sj] == 0 || /*visited[si][sj] */  board[si][sj] == -1 ){
            return ;
        }

        if(si == di && sj == dj) {
            list.add(str);
            return;
        }

//        visited[si][sj] = true;
        board[si][sj] = -1;

//        for(int[] dir : dirs){
//            available(board, si+dir[0], sj+dir[1], di, dj, count) ;
//        }

        available(board, si+1, sj, di, dj, list, str+'D');
        available(board, si-1, sj, di, dj, list, str+'U');
        available(board, si, sj+1, di, dj, list, str+'R');
        available(board, si, sj-1, di, dj, list, str+'L');

//        visited[si][sj] = false;
        board[si][sj]  = 1;
//        return count[0];
    }
}

