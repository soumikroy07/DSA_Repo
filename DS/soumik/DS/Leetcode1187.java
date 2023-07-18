package com.soumik.DS.soumik.DS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leetcode1187 {
    public static void main(String[] args) {
        int arr1[] = new int[]{1,5,3,6,7};
        int arr2[] = new int[]{4,3,1};
        int ans = makeArrayIncreasing(arr1, arr2);
        System.out.println(ans);
    }

    public static int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        Map<int[], Integer> dp = new HashMap<>();
        int ans = help(dp, 0, Integer.MIN_VALUE, arr1, arr2);
        return ans >= Integer.MAX_VALUE/2 ? -1 : ans;
    }

    static int help(Map<int[], Integer> dp, int i, int prev, int arr1[], int arr2[]){
        if(i >= arr1.length){
            return 0;
        }
        int nums[] = new int[]{i, prev};
        if(dp.containsKey(nums)){
            return dp.get(nums);
        }
        int ans = Integer.MAX_VALUE / 2;
        int idx = getIndex(arr2, prev);
        if(prev < arr1[i]){
            ans = Math.min(ans, help(dp, i+1, arr1[i], arr1, arr2));
        }
        if(idx < arr2.length){
            ans = Math.min(ans, help(dp, i+1, arr2[idx], arr1, arr2)+1);
        }

        dp.put(nums, ans);
        return ans;
    }

    static int getIndex(int arr[], int key){
        int start = 0, end = arr.length-1, ans = arr.length+1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] <= key){
                start = mid+1;
            }else{
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
}
