package com.soumik.DS.soumik.DS;

public class Leetcode54 {
    public static void main(String[] args) {
        int a[][] = new int[][]{{1,2,3},
                                {4,5,6},
                                {7,8,9}};
        int ans = findK(a, a.length, a[0].length, 4);
        System.out.println(ans);
    }

    private static int findK(int[][] a, int n, int m, int k) {
        if(m * n < k){
            return -1;
        }

        int top = 0, left = 0, right = m-1, bottom = n-1;

        while(k > 0){
            for(int i=left; i<=right; i++){
                k--;
                if(k == 0){
                    return a[top][i];
                }
            }

            for(int i=top+1; i<bottom; i++){
                k--;
                if(k == 0){
                    return a[i][right];
                }
            }

            for(int i=right; i>=left; i--){
                k--;
                if(k == 0){
                    return a[bottom][i];
                }
            }

            for(int i=bottom-1; i>top; i--){
                k--;
                if(k == 0){
                    return a[i][left];
                }
            }

            top++;
            left++;
            right--;
            bottom--;
        }
        return -1;
    }
}
