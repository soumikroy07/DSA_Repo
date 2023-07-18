package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode_weekly_332_2 {
    public static void main(String[] args) {
        int nums[] = new int[]{0,1,7,4,4,5};
        long ans = countFairPairs(nums, 3, 6);
        System.out.println(ans);
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long pairsWithUpper = findLessThanEqual(nums, upper);
        long pairsWithLowerMinus1 = findLessThanEqual(nums, lower-1);
        return pairsWithUpper - pairsWithLowerMinus1;
    }
    static long findLessThanEqual(int nums[], int val){
        int i=0, j=nums.length-1;
        long pairs = 0L;
        while(j != 0){
            while(i < j && nums[i]+nums[j] <= val){
                i++;
            }
            pairs += (long)Math.min(i, j);
            j--;
        }
        return pairs;
    }
}
