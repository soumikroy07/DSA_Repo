package com.soumik.DS.soumik.DS;


public class Leetcode2226 {
    public static void main(String[] args) {
        int candies[] = new int[]{5, 8, 6};
        long k = 3L;
        int ans = maximumCandies(candies, k);
        System.out.println(ans);
    }

    private static int maximumCandies(int[] candies, long k) {
        long sum = 0L;
        int high = Integer.MIN_VALUE;
        for(int candy : candies){
            sum += (long)(candy);
            high = Math.max(high, candy);
        }

        if(sum < k){
            return 0;
        }

        int low = 1, ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(possible(candies, mid, k)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return ans;
    }

    private static boolean possible(int[] arr, int val, long k) {
        long total = 0;
        for(int a : arr){
            total += (long)(a / val);
        }

        return total >= k;
    }
}
