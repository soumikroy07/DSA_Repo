package com.soumik.DS.soumik.DS;

import java.util.*;

public class Leetcode_weekly_342_3 {
    public static void main(String[] args) {
        int nums[] = new int[]{1,-1,-3,-2,3};
        int ans[] = getSubarrayBeauty(nums, 3, 2);
        for (int i: ans){
            System.out.print(i + " ");
        }
    }

    private static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        TreeMap<Integer, Integer> min = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums[i];

            min.put(num, min.getOrDefault(num, 0) + 1);

            if (i >= k) {
                int window = nums[i - k];
                min.put(window, min.get(window) - 1);
                if (min.get(window) == 0) {
                    min.remove(window);
                }
            }

            if (i >= k - 1) {
                int c = 0;
                int value = 0;

                for (Map.Entry<Integer, Integer> m : min.entrySet()) {
                    c += m.getValue();
                    if (c >= x) {
                        value = m.getKey();
                        break;
                    }
                }

                result[i - k + 1] = value < 0 ? value : 0;
            }
        }

        return result;
    }
}
