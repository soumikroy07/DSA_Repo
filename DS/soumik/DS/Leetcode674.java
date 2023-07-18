package com.soumik.DS.soumik.DS;

public class Leetcode674 {
    public static void main(String[] args) {
        int nums[] = {1,3,5,4,2,3,4,5};
        int ans = findLengthOfLCIS(nums);
        System.out.println(ans);
    }

    private static int findLengthOfLCIS(int[] nums) {
        int maxLength = 1, length = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                length++;
                maxLength = Math.max(maxLength, length);
            }else{

                length = 1;
            }
        }
        return maxLength;
    }
}
