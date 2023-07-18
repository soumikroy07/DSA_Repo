package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode_weekly_336_2 {
    public static void main(String[] args) {
        int nums[] = new int[]{2};
        int ans = maxScore(nums);
        System.out.println(ans);
    }

    private static int maxScore(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int prefix[] = new int[n];
        prefix[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            prefix[i] = prefix[i+1] + nums[i];
        }
        int count = 0;
        for(int pre : prefix){
            count += pre > 0 ? 1 : 0;
        }
        return count;
    }
}
