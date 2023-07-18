package com.soumik.DS.soumik.DS;

public class GFG_POTD_30_OCT {
    public static void main(String[] args) {
        int N = 8;
        long ans = noOfChicks(N);
        System.out.println(ans);
    }

    private static long noOfChicks(int N) {
        long[] dp = new long[N+1];
        dp[1] = 1L;
        for(int i=2; i<=N; i++){
            long total = 0L;
            if(i <= 6){
                for(int j=1; j<i; j++){
                    total += (dp[j] * 2);
                }
                dp[i] = total;
            }else{
                for(int j=1; j<i; j++){
                    total += (dp[j] * 2);
                }
                dp[i] = total - dp[i-6];
            }
        }

        long ans = 0L;
        for(int i=0; i<=N; i++){
            ans += dp[i];
        }

        return ans;
    }
}
