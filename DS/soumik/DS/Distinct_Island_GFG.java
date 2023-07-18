package com.soumik.DS.soumik.DS;

import java.util.HashSet;

public class Distinct_Island_GFG {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 1, 0, 1, 1},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 1, 0, 1, 1}};
        int x = countDistinctIslands(grid);
        System.out.println(x);
    }

    private static int countDistinctIslands(int[][] grid) {
        HashSet<String> set = new HashSet<>();
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    String str = "";
                    getArea(grid, i, j, str);
                    set.add(str);
                }
            }
        }
        for(String s : set){
            System.out.print(s + " ");
        }
        return set.size();
    }

    static void getArea(int[][] grid, int i, int j, String str){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == 0){
            return;
        }

        grid[i][j] = 0;

        getArea(grid, i+1, j, str+"D");
        getArea(grid, i-1, j, str+"U");
        getArea(grid, i, j-1, str+"L");
        getArea(grid, i, j+1, str+"R");

        // return area;
    }
}
