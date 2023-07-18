package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        int arr[] = {9, 1, 2, 3, 1, 5};
        int x = lengthOfLIS(arr, arr.length);
        System.out.println(x);
    }
    public static int lengthOfLIS(int[] h, int n) {
//        int n = nums.length;
//        int arr[] = new int[n];
//        arr[0] = nums[0];
//        int length = 1;
//        for(int i=1; i<n; i++){
//            if(arr[length-1] < nums[i]){
//                arr[length] = nums[i];
//                length++;
//            }else{
//                int low=0, high = length, mid=0;
//                while(low < high){
//                    mid = low+(high-low)/2;
//                    if(arr[mid] > nums[i]){
//                        high = mid-1;
//                    }else{
//                        low = mid+1;
//                    }
//                }
//                arr[mid-1] = nums[i];
//            }
//        }
//        return length;

        int dp[] = new int[n+1];
        int ans = 0;
        Arrays.fill(dp, Integer.MAX_VALUE);
//        Arrays.fill(dp, 1);
//         for(int i=1; i<n; i++){
//             int max = 0;
//             for(int j=i-1; j>=0; j--){
//                 if(h[i] > h[j]){
//                     max = Math.max(dp[j], max);
//                 }
//             }
//             dp[i] = max+1;
//             ans = Math.max(ans, dp[i]);
//         }


        dp[0] = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            int key = h[i];
            int low = 0, high = dp.length;
            while(low <= high){
                int mid = low + (high - low) / 2;
                if(dp[mid] >= key && dp[mid-1] < key){
                    dp[mid] = key;
                    break;
                }else if(dp[mid] < key){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }

        for(int i=n; i>=0; i--){
            if(dp[i] != Integer.MAX_VALUE){
                ans = i;
                break;
            }
        }

        return ans;
    }
}
