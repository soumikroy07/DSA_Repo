package com.soumik.DS.soumik.DS;

import java.util.Collections;
import java.util.PriorityQueue;

public class Amazon_set_15 {
    public static void main(String[] args) {
        int nums[] = {18,2,4,7}, limit = 4;
        int ans = longestSubarray(nums, limit);
        System.out.println(ans);
    }

    private static int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int j=0, ans = 0;
        for(int i=0; i<nums.length; i++){
            maxHeap.add(nums[i]);
            minHeap.add(nums[i]);

            if(maxHeap.peek() - minHeap.peek() <= limit){
//                ans = Math.max(ans, i-j+1);
                ans++;
            }else{
                while(maxHeap.peek() - minHeap.peek() > limit && j <= i){
                    maxHeap.remove(nums[j]);
                    minHeap.remove(nums[j]);
                    j++;
                }
                if(maxHeap.peek() - minHeap.peek() <= limit){
//                ans = Math.max(ans, i-j+1);
                    ans++;
                }
            }
        }

        return ans;
    }
}
