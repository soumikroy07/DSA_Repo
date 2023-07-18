package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode90 {
    public static void main(String[] args) {
        int arr[] = {1,2,2};
        List<List<Integer> > ans = subsetsWithDup(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,nums,new ArrayList<>(), ans);
        return ans;
    }

    public static void helper(int idx, int arr[], ArrayList<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=idx; i<arr.length; i++){
            if(i != idx && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            helper(i+1, arr, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}
