package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode2195 {
    public static void main(String[] args) {
        int arr[] = {5, 6}, k = 6;
        long ans = minimulKSum(arr, k);
        System.out.println(ans);
    }

    private static long minimulKSum(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0, j=1, count = 0;
        long sum = 0L;
        if(nums[i] > 1){
            int middle_no = nums[i] - 1;
            if(middle_no <= k){
                long val = getSum(nums[i]-1, 0);
                sum += val;
                k -= middle_no;
            }else{
                long val = getSum(k, 0);
                k = 0;
                sum += val;
            }
        }
        while(j < nums.length){
            int middle_no = nums[j] - nums[i] - 1;
            if(middle_no == 0){
                i++;
                j++;
                continue;
            }
            if(middle_no >= k){
                long val = getSum(nums[j]-1, nums[i]);
                sum += val;
                k -= middle_no;
            }else if(middle_no < k){
                long val = getSum(nums[i]+k, nums[i]);
                sum += val;
                k=0;
            }
            if(k == 0){
                break;
            }
            i++;
            j++;
        }

        if(k > 0){
            long val = getSum(nums[nums.length-1]+k, nums[nums.length-1]);
            sum += val;
        }

        return sum;
    }

    static long getSum(int a, int b){
        long sum1 = ((long) a * (long)(a+1)) / 2L;
        long sum2 = ((long) b * (long)(b+1)) / 2L;
        return sum1 - sum2;
    }
}
