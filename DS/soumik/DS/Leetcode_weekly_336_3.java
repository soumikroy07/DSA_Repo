package com.soumik.DS.soumik.DS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_weekly_336_3 {
    public static void main(String[] args) {
        int nums[] = new int[]{1, 10, 4};
        long ans = beautifulSubarrays(nums);
        System.out.println(ans);
    }

    private static long beautifulSubarrays(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0, count = 0;
        for(int num : nums){
            ans ^= num;
            if(map.containsKey(ans)){
                count += map.get(ans);
            }
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }
        return count;
    }


}
