package com.soumik.DS.soumik.DS;

import java.util.ArrayList;

public class Rat {
    public static void main(String[] args) {
        int m[][] = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};
        int n= 4;

        ArrayList<String> ans = findPath(m,n);

        for (int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        boolean track[][] = new boolean[n][n];
        ArrayList<String> arr = new ArrayList<>();
        int di[] = {1,-1,0,0};
        int dj[] = {0,0,1,-1};
        paths(m, track, arr, 0, 0, n, "", di,dj);
        return arr;
    }

    static void paths(int m[][], boolean track[][], ArrayList<String> arr,
                      int i, int j, int n, String s,int di[], int dj[]){

        if(m[0][0] == 0){
            return;
        }

        if(i == n-1 && j == n-1){
            arr.add(s);
            return;
        }

        String str = "DURL";

        for(int idx=0; idx<4; idx++){
            int nxti = i+di[idx];
            int nxtj = j+dj[idx];
            if(nxti>=0 && nxti<n && nxtj>=0 && nxtj<n && !track[nxti][nxtj] && m[nxti][nxtj] == 1){
                track[i][j] = true;
                paths(m, track, arr, i+di[idx], j+dj[idx], n, s+str.charAt(idx), di, dj);
                track[i][j] = false;
            }
        }

//        if(i<n-1 && m[i+1][j] == 1 && !track[i+1][j]){
//            track[i][j] = true;
//            paths(m, track, arr, i+1, j, n, s+'D');
//            track[i][j] = false;
//        }
//        if(i>0 && m[i-1][j] == 1 && !track[i-1][j]){
//            track[i][j] = true;
//            paths(m, track, arr, i-1, j, n, s+'U');
//            track[i][j] = false;
//        }
//        if(j<n-1 && m[i][j+1] == 1 && !track[i][j+1]){
//            track[i][j] = true;
//            paths(m, track, arr, i, j+1, n, s+'R');
//            track[i][j] = false;
//        }
//        if(j>0 && m[i][j-1] == 1 && !track[i][j-1]){
//            track[i][j] = true;
//            paths(m, track, arr, i, j-1, n, s+'L');
//            track[i][j] = false;
//        }
    }
}
