package com.soumik.DS.soumik.DS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode1293 {
    static int dirs[][] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public static void main(String[] args) {
        int grid[][] = {{0,0,0},{1,1,0},{0,0,0},{0,1,1},{0,0,0}};
        int k = 1;
        int ans = shortestPath(grid, k);
        System.out.println(ans);
    }

    private static int shortestPath(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;

        HashSet<Trio> memo = new HashSet<>();
        Queue<Trio> q = new LinkedList<>();

        q.add(new Trio(0, 0, k));
        memo.add(new Trio(0, 0, k));
        int steps = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                Trio curr = q.poll();
                int row = curr.row;
                int col = curr.col;
//                int obs = curr.obs;
                if(row == m-1 && col == n-1){
                    return steps;
                }
                for(int[] dir : dirs){
                    int r = row + dir[0] , c = col + dir[1];
                    if(r >= 0 && r < m && c >= 0 && c < n && curr.obs >= 0 && !memo.contains(new Trio(r, c, curr.obs))){
                        if(grid[r][c] == 1){

                            if(curr.obs > 0){
                                q.add(new Trio(r, c, curr.obs - 1));
                                memo.add(new Trio(r, c, curr.obs - 1));
                            }
                        }else{
                            q.add(new Trio(r, c, curr.obs));
                            memo.add(new Trio(r, c, curr.obs));
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
class Trio{
    int row, col, obs;

    Trio(int r, int c, int o){
        row = r;
        col = c;
        obs = o;
    }
}