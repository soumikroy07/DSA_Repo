package com.soumik.DS.soumik.DS;

import java.util.ArrayList;

public class GFG_POTD_18_OCT {
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};

        ArrayList<Integer> ans = downwardDigonal(3, A);
        System.out.println(ans);
    }

    private static ArrayList<Integer> downwardDigonal(int N, int[][] A) {
        ArrayList<Integer> a=new ArrayList<>();
        int j=0;
        int i=0;
        while((i<N)&&(j<N)){
            if((i==0)&&(j!=N-1)){
                // i should be fixed && j is incremented
                int k=j;
                int l=i;
                while(l<=j){
                    a.add(A[l++][k--]);
                }
                j++;
            }
            else if(j==N-1){
                // j fixed && i is incremented
                int k=j;
                int l=i;
                while(i<=k){
                    a.add(A[l++][k--]);
                }
                i++;
            }
        }
        return a;
    }
}
