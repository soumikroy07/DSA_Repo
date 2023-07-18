package com.soumik.DS.soumik.DS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_Biweekly_91 {
    public static void main(String[] args) {
        int nums[] = {9,5,7,8,7,9,8,2,0,7};
        int ans = distinctAverages(nums);
        System.out.println(ans);
    }

    private static int distinctAverages(int[] nums) {
        int n = nums.length;
        Set<Float> set = new HashSet<>();

        Arrays.sort(nums);
        int i=0, j = n-1;

        while(i < j){
            float avg = (float)((nums[i] + nums[j])/2.00);
            set.add(avg);
            i++;
            j--;
        }

        return set.size();
    }
}
