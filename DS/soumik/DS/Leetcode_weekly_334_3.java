package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode_weekly_334_3 {
    public static void main(String[] args) {
        int nums[] = new int[]{3,5,2,4};
        int ans = maxNumOfMarkedIndices(nums);
        System.out.println(ans);
    }

    private static int maxNumOfMarkedIndices(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = (n-1) / 2 , j = n-1, count = 0;
        while(i >= 0){
            if(2 * nums[i] <= nums[j]){
                i--;
                j--;
                count++;
            }else{
                i--;
            }
        }
        return count * 2;
    }
}
