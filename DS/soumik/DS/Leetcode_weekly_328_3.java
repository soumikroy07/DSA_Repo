package com.soumik.DS.soumik.DS;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_weekly_328_3 {
    public static void main(String[] args) {
        int arr[] = {2,1,3,1,2,2,3,3,2,2,1,1,1,3,1}, k = 11;
        long ans = countGood(arr, k);
        System.out.println(ans);
    }

    private static long countGood(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long count = 0L;
        int noOfPairs = 0;
        for(int num : nums) {
            if(map.getOrDefault(num, 0) >= 2){
                int no = map.get(num);
                noOfPairs -= ((no - 1) * no) / 2;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) >= 2){
                int no = map.get(num);
                noOfPairs += ((no - 1) * no) / 2;
            }
            if(noOfPairs >= k){
                count++;
            }
        }

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(map.get(num) >= 2){
                int no = map.get(num);
                noOfPairs -= ((no - 1) * no) / 2;
            }
            map.put(num, map.get(num)-1);
            if(map.get(num) >= 2){
                int no = map.get(num);
                noOfPairs += ((no - 1) * no) / 2;
            }
            if(noOfPairs >= k){
                count++;
            }
        }

        return count;
    }
}
