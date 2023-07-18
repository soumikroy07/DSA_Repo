package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode2448 {
    public static void main(String[] args) {
        int nums[] = new int[]{1,3,5,2};
        int cost[] = new int[]{2,3,1,14};
        long ans = minCost(nums, cost);
        System.out.println(ans);
    }

    private static long minCost(int[] nums, int[] cost) {
        Pair arr[] = new Pair[nums.length];
        for (int i=0; i< nums.length; i++){
            arr[i] = new Pair(nums[i], cost[i]);
        }

        Arrays.sort(arr);

        long sum = 0L;
        for(int i=0; i< arr.length; i++){
            sum += arr[i].cost;
        }

        int i=0;
        long total = 0L, median = 0L;
        while(i < arr.length && total < (sum+1)/2){
            total += arr[i].cost;
            median = (long)arr[i].num;
            i++;
        }

        long res = 0L;
        for (int j = 0; j < arr.length; ++j)
            res += 1L * Math.abs(nums[j] - median) * cost[j];
        return res;
    }

    private static class Pair implements Comparable<Pair>{
        int num, cost;
        Pair(int n, int c){
            num = n;
            cost = c;
        }

        public int compareTo(Pair o){
            return this.num - o.num;
        }
    }
}
