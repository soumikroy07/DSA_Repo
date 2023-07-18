package com.soumik.DS.soumik.DS;

import java.util.Map;
import java.util.TreeMap;

public class Leetcode_weekly_354_2 {
    public static void main(String[] args) {
        int nums[] = new int[]{4,6,1,2};
        int ans = maximumBeauty(nums, 2);
        System.out.println(ans);
    }

    private static int maximumBeauty(int[] nums, int k) {
//        Arrays.sort(nums);
//
//        int maxButy = 0;
//        for(int i: nums){
//            int left = Math.max(0, i-k);
//            int right = i+k;
//
//            int leftIdx = findIndexOnLeft(nums, left);
//            int rightIdx = findIndexOnRight(nums, right);
//
//            maxButy = Math.max(maxButy, rightIdx - leftIdx + 1);
//        }
//
//        return maxButy;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i: nums){
            int low = i-k;
            int high = i + k + 1;
            map.put(low, map.getOrDefault(low, 0) + 1);
            map.put(high, map.getOrDefault(high, 0) -1);
        }

        int temp = 0, ans = 0;
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            temp += m.getValue();
            ans = Math.max(temp, ans);
        }
        return ans;
    }

    private static int findIndexOnRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private static int findIndexOnLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }


}
