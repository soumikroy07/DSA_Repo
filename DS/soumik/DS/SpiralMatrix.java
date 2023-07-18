package com.soumik.DS.soumik.DS;

public class SpiralMatrix {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
        int r = 4, c=4;
        int ans[] = reverseSpiral(r, c, a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] reverseSpiral(int r, int c, int[][] a) {
        int ans[] = new int[r*c];
        int k=(r*c)-1, top = 0, bottom = r-1, left = 0, right = c - 1;
        int dir = 0;

        while(top <= bottom && left <= right && k>=0){
            if(dir == 0){
                for(int i=left; i<=right; i++){
                    ans[k--] = a[top][i];
                }
                dir++;
                top++;
            }
            else if(dir == 1){
                for(int i=top; i<=bottom; i++){
                    ans[k--] = a[i][right];
                }
                right--;
                dir++;
            }
            else if(dir == 2){
                for(int i=right; i>=left; i--){
                    ans[k--] = a[bottom][i];
                }
                bottom--;
                dir++;
            }else{
                for(int i=bottom; i>=top; i--){
                    ans[k--] = a[i][left];
                }
                left++;
                dir=0;
            }
        }
        return ans;
    }
}
