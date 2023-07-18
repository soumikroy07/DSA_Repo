package com.soumik.DS.soumik.DS;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_weekly_339_2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4};
        List<List<Integer>> ans = findMatrix(nums);
        for(List<Integer> list: ans){

            System.out.println(list);
        }
    }

    private static List<List<Integer>> findMatrix(int[] nums) {
        int max = -1;
        List<List<Integer>> ans = new ArrayList<>();
        int freq[] = new int[201];
        for (int num : nums){
            freq[num]++;
            max = Math.max(max, freq[num]);
        }

        while(max-- > 0){
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<=200; i++){
                if(freq[i] == 0){
                    continue;
                }
                list.add(i);
                freq[i]--;
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;

    }
}
