package com.soumik.DS.soumik.DS;

public class LeetcodeWeekly318 {
    public static void main(String[] args) {
        int nums[] = new int[]{0,1};
        int ans[] = applyOperations(nums);
        for(int i : ans){
            System.out.print(i+ " ");
        }
    }

    private static int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }

        for(int i=n-1; i>=0; i--){
            if(nums[i] == 0){
                for(int j=i; j<n-1; j++){
                    nums[j] = nums[j+1];
                }
                nums[n-1] = 0;
            }

        }

        return nums;
    }
}
