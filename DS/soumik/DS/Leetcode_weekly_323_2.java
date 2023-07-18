package com.soumik.DS.soumik.DS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_weekly_323_2 {
    public static void main(String[] args) {
        int nums[] = {2,3,5,6,7};
        int ans = longestSquareStreak(nums);
        System.out.println(ans);
    }

    private static int longestSquareStreak(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);

        for(int num : nums){
            set.add(num);
        }
        int ans = -1;
        for(int num : nums){
            int max = 1;
            while(true){
                if(set.contains(num * num)){
                    max++;
                    ans = Math.max(max, ans);
                    num = num * num;
                }else{
                    break;
                }
            }
        }

        return ans;
    }
}
