package com.soumik.DS.soumik.DS;

public class Leetcode209 {
    public static void main(String[] args) {
        int target = 167;
        int nums[] = {84, -37, 32, 40, 95};

        int ans = minSubArrayLen(target, nums);
        System.out.println(ans);
    }

    private static int minSubArrayLen(int target, int[] nums) {

        int right = 0, left = 0, sum = 0, total = 0;
//         for(int num : nums) total += num;

//         if(total < target) return -1;


        int maxLength =  Integer.MAX_VALUE;
        while(right < nums.length){
            while(sum < target && right < nums.length){
                sum += nums[right++];
            }

            while(sum >= target && left <= right){
                int length = right - left ;
                maxLength = Math.min(length, maxLength);
                sum -= nums[left++];
            }


        }

        return maxLength == Integer.MAX_VALUE ? -1 : maxLength;
    }
}
