package com.soumik.DS.soumik.DS;

public class Leetcode918 {
    public static void main(String[] args) {
        int nums[] = {5,-3,5};
        int ans = maxSubarraySumCircular(nums);
        System.out.println(ans);
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int arr[] = new int[2*n];

        for(int i=0; i<n; i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }

        int curr = arr[0];
        int res = arr[0];

        for(int i=1; i<n; i++){
            curr = Math.max(curr+arr[i], arr[i]);
            res = Math.max(res, curr);
        }

        return res;
    }
}
