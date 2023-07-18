package com.soumik.DS.soumik.DS;

public class LeetcodeContest315_4 {
    public static void main(String[] args) {
        int nums[] = {1,3,5,2,7,5};
        int minK = 1, maxK = 5;

        long ans = countSubarrays(nums, minK, maxK);
        System.out.println(ans);
    }

    private static long countSubarrays(int[] nums, int minK, int maxK) {

        long ans = 0L;

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(isPossible(nums, i, j, minK, maxK)){
                    ans++;
                }
            }
        }

        return ans;
    }
    static boolean isPossible(int nums[], int i, int j, int max, int min){
        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;

        for(int k=i; k<=j; k++){
            mx = Math.max(mx, nums[k]);
            mn = Math.min(mn, nums[k]);
        }

        if(mx == max && mn == min){
            return true;
        }else{
            return false;
        }
    }
}
