package com.soumik.DS.soumik.DS;

public class Leetcode2439 {
    public static void main(String[] args) {
        int nums[] = new int[]{6,9,3,8,14};
        int ans = minimizeArrayValue(nums);
        System.out.println(ans);
    }

    private static int minimizeArrayValue(int[] nums) {
        int n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i-1] < nums[i]){
                int mid = nums[i-1] + (nums[i] - nums[i-1]) / 2;
                int diff = nums[i] - mid;
                nums[i] -= diff;
                nums[i-1] += diff;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int num: nums){
            max = Math.max(max, num);
        }
        return max;
    }
}
