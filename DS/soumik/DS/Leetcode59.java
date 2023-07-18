package com.soumik.DS.soumik.DS;

public class Leetcode59 {
    public static void main(String[] args) {
        int ans[][] = generateMatrix(3);
        for (int a[]: ans){
            for(int i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static int[][] generateMatrix(int n) {
        int ans[][] = new int[n][n];
        int top = 0, bottom = n-1, left = 0, right = n-1;
        int total = n * n;
        int val = 1;

        while(val <= total){
            for(int i=left; i<=right && val <= total; i++){
                ans[top][i] = val++;
            }

            for(int i=top+1; i<bottom && val <= total; i++){
                ans[i][right] = val++;
            }

            for(int i=right; i>=left && val <= total; i--){
                ans[bottom][i] = val++;
            }

            for(int i=bottom-1; i>top && val <= total; i--){
                ans[i][left] = val++;
            }

            top++;
            bottom--;
            left++;
            right--;
        }

        return ans;
    }
}
