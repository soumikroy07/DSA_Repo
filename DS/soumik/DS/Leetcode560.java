package com.soumik.DS.soumik.DS;

import java.util.HashSet;
import java.util.Set;

public class Leetcode560 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k = 3;
        int ans = subarraySum(arr, k);
        System.out.println(ans);
    }

    public static int subarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int sum = 0, count = 0;
        set.add(0);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(set.contains(sum - k)){
                count++;
            }else{
                set.add(sum);
            }
        }

        return count;
    }
}
