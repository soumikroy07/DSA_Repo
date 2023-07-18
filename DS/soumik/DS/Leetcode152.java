package com.soumik.DS.soumik.DS;

public class Leetcode152 {
    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        int ans = maxProduct(nums);
        System.out.println(ans);
    }

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];

        int product = 1;
        for(int i=0; i<n; i++){
            product = nums[i]*product;
            left[i] = product;
            if(product == 0){
                product = 1;
            }
        }
        product = 1;
        for(int i=n-1; i>=0; i--){
            product = product*nums[i];
            right[i] = product;
            if(product == 0){
                product = 1;
            }
        }

        int ans = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            ans = Math.max(ans,Math.max(left[i], right[i]));
        }

        return ans;
    }
}
