package com.soumik.DS.soumik.DS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetcodeWeekly318_2 {
    public static void main(String[] args) {
        int nums[] = new int[]{1,5,4,2,9,9,9};
        int k = 3;
        long ans = maximumSubarraySum(nums, k);
        System.out.println(ans);
    }

    private static long maximumSubarraySum(int[] nums, int k) {
        long currSum = 0L;
        long ans = 0L;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            currSum += nums[i];
        }

        if(map.size() == k){
            ans = currSum;
        }

        int left = 0;
        for(int i=k; i<n; i++){
            currSum -= (long) nums[left];
            currSum += (long) nums[i];

            map.put(nums[left], map.get(nums[left]) - 1);

            if(map.get(nums[left]) == 0){
                map.remove(nums[left]);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            left++;

            if(map.size() == k && currSum > ans){
                ans = currSum;
            }
        }

        return ans;
    }
}
