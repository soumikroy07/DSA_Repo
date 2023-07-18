package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_weekly_351_3 {
    public static void main(String[] args) {
        int nums[] = new int[]{1,0,0,0,0,0,1,0,1};
        int ans = numberOfGoodSubarraySplits(nums);
        System.out.println(ans);
    }

    private static int numberOfGoodSubarraySplits(int[] nums) {
        int mod = (int) 1e9+7;
        List<Integer> list = new ArrayList<>();
//        int zero = 0;
//        int i=0;
//        while(i < nums.length && nums[i] == 0){
//            i++;
//        }
//
//        for(int j=i+1; j<nums.length; j++){
//            if(nums[j] == 1){
//                list.add(zero);
//                zero = 0;
//            }
//            zero++;
//        }
//
//        if(list.size() == 1){
//            return 1;
//        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                list.add(i);
            }
        }

        int res = 1;
        for(int x=0; x<list.size()-1; x++){
            int diff = list.get(x+1) - list.get(x);
            res = (res*diff) % mod;
        }
        return res;
    }
}
