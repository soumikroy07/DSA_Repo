package com.soumik.DS.soumik.DS;

public class Leetcode_weekly_334_1 {
    public static void main(String[] args) {
        int nums[] = new int[]{1};
        int ans[] = leftRigthDifference(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int left[] = new int[n];
        int l_sum = 0;
        for(int i=0; i<n; i++){
            left[i] = l_sum;
            l_sum += nums[i];
        }

        int r_sum = 0;
        int right[] = new int[n];
        for (int i = n-1; i >= 0 ; i--) {
            right[i] = r_sum;
            r_sum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(left[i] - right[i]);
        }
        return ans;
    }
}
