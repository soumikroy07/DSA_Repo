package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode1498 {
    public static void main(String[] args) {
        int nums[] = new int[]{2,3,3,4,6,7};
        int ans = numSubseq(nums, 12);
        System.out.println(ans);
    }

    private static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1, ans= 0;
        while(i+1 < j){
            if(nums[i] + nums[j] > target){
                j--;
            }else{
                int window = j - i;
                ans += (int)Math.pow(2, window);
                i++;
            }
        }

//        int window = j - i + 1;
//
//        int val = (int)Math.pow(2, window) - window - 1;
//
        j = nums.length - 1;
        while(j >= 0 && nums[j] + nums[j] > target){
            j--;
        }
//
        int newWindow = j - i + 1;
//
        ans += newWindow;
//
        return ans;
    }
}
