package com.soumik.DS.soumik.DS;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode1926 {
    public static void main(String[] args) {
        char maze[][] = new char[][]{{'+', '+', '+'},{'.', '.', '.'},{'+', '+', '+'}};
        int entrance[] = {1, 0};

        int ans = nearestExit(maze, entrance);
        System.out.println(ans);
    }
    static int dirs[][] = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private static int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> q = new LinkedList<>();
        q.add(entrance);
        // visited[entrance[0]][entrance[1]] = true;
        maze[entrance[0]][entrance[1]] = '+';
        int steps = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int[] curr = q.poll();
                if((curr[0] == 0 || curr[0] == maze.length-1 || curr[1] == 0 || curr[1] == maze[0].length-1) && maze[curr[0]][curr[1]] == '.'){
                    return steps;
                }

                maze[curr[0]][curr[1]] = '+';

                for(int dir[] : dirs){
                    int x = curr[0]+dir[0], y = curr[1]+dir[1];

                    if(x < maze.length && x >= 0 && y < maze[0].length && y >= 0 && maze[x][y] == '.'){
                        q.add(new int[]{x, y});
                    }
                }
            }
            steps++;
        }

        return -1;
    }
}
