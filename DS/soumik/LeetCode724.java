package com.soumik.DS.soumik;

public class LeetCode724 {
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        int x = pivotIndex(arr);
        System.out.println(x);
    }

    private static int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum = sum+num;
        }

        if(sum % 2 != 0)
            return -1;
        else
            sum = sum / 2;

        int i = 0;
        while(i < nums.length){
            sum = sum - nums[i];
            if(sum == 0){
                return nums[i];
            }else if(sum < 0){
                return -1;
            }
            i++;
        }

        return -1;
    }

}
