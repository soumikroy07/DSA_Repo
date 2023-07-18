package com.soumik.DS.soumik.DS;

public class GFG_POTD_14_MAY {
    public static void main(String[] args) {
        int arr[] = new int[]{-1,-1,-3,-4};
        long ans = findMaxSubsetSum(arr.length, arr);
        System.out.println(ans);
    }

    static long dp[];
    public static long findMaxSubsetSum(int N, int[] A) {
        // code here
        dp = new long[N+1];
        // Arrays.fill(dp, Long.MIN_VALUE);
        return solve(A, 0, true);
    }

    static long solve(int arr[], int i, boolean take){

        if(i >= arr.length){
            return 0;
        }

        if(dp[i] != 0){
            return dp[i];
        }

        long ans = 0;

        if(take){
            long ans1 = (arr[i] + solve(arr, i+1, true));
            long ans2 = solve(arr, i+1, false);
            ans += Math.max(ans1, ans2);
        }else{
            long ans3 = (arr[i] + solve(arr, i+1, true));
            ans += ans3;
        }

        return dp[i]=ans;


    }
}
