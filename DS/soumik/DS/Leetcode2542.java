package com.soumik.DS.soumik.DS;

import java.util.Collections;
import java.util.PriorityQueue;

public class Leetcode2542 {
    public static void main(String[] args) {
        int num1[] = new int[]{1,3,3,2};
        int num2[] = new int[]{2,1,3,4};
        long ans = maxScore(num1, num2, 3);
        System.out.println(ans);
    }

    private static long maxScore(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> min1 = new PriorityQueue<>();

        long ans = 0L, sum = 0L;

        for (int i = 0; i < nums2.length; i++) {
            if(min1.size() < k){
                min1.add(nums1[i]);
                sum += (long) nums1[i];
            }else if(min1.peek() < nums1[i]){
                sum -= (long) min1.peek();
                min1.poll();
                min1.add(nums1[i]);
                sum += (long) nums1[i];
            }

            if(min.size() < k){
                min.add(nums2[i]);
            }else if(min.peek() < nums2[i]){
                min.poll();
                min.add(nums2[i]);
            }

            ans = Math.max(ans, sum * min.peek());
        }

        return ans;
    }
}
