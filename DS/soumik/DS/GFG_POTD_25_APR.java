package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class GFG_POTD_25_APR {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4};
        int ans = goodSubsets(arr, arr.length);
        System.out.println(ans);
    }

    private static int goodSubsets(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int mod = (int)1e9+7;
        for(int a: arr){
            max = Math.max(a, max);
        }

        boolean prime[] = new boolean[max+1];
        Arrays.fill(prime, true);
//        prime[1] = true;
//        prime[2] = true;
//        prime[3] = true;

        for(int i=2; i<= max; i++){
            if(prime[i]){
                for(int j=i+i; j<=max; j+=i){
                    prime[j] = false;
                }
            }
        }

        int left = -1, right = 0, ans = 0;
        while(right < n){
            if(prime[arr[right]]){
                left = right;
                while(right < n && prime[arr[right]]){
                    right++;
                }
                int window = right - left;
                ans = (ans + ((window+1) * window) / 2) % mod;
            }else{
                right++;
            }
        }
        return ans;
    }
}
