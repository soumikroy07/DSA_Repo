package com.soumik.DS.soumik.DS;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_weekly_354_3 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3,3,3,3,7,2,2);
        int ans = minimumIndex(nums);
        System.out.println(ans);
    }

    private static int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int maxOcc = -1, maxFreq = -1;

        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            if(maxFreq < m.getValue()){
                maxFreq = m.getValue();
                maxOcc = m.getKey();
            }
        }

        if(maxFreq * 2 <= nums.size()){
            return -1;
        }

        int count = 0;

        for(int i=0; i< nums.size(); i++){
            if(nums.get(i) == maxOcc){
                count++;
            }

            if(count * 2 > i+1 && (maxFreq - count) * 2 > nums.size() - i - 1){
                return i;
            }
        }
        return -1;
    }
}
