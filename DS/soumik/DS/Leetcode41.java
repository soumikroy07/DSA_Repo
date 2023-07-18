package com.soumik.DS.soumik.DS;

public class Leetcode41 {
    public static void main(String[] args) {
        int nums[] = {7, 8, 9, 11, 12};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }

    private static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean one = false;
        for(int i=0; i<n; i++){
            if(nums[i] == 1) one = true;
            if(nums[i] < 1 || nums[i] > n){
                nums[i] = 1;
            }

        }

        if(one == false) return 1;
        for(int i=0; i<n; i++){
            int newIdx = Math.abs(nums[i]);
            nums[newIdx-1] = Math.abs(nums[newIdx-1]) * -1;
        }

        for(int i = 0; i<n; i++){
            if(nums[i] > 0){
                return i+1;
            }
        }

        return n+1;
    }
}
