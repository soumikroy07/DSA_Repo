package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Leetcode373 {
    public static void main(String[] args) {
        int nums1[] = new int[]{1,2};
        int nums2[] = new int[]{3};
        List<List<Integer>> ans = kSmallestPairs(nums1, nums2, 3);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    private static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[4] - b[4]);
        List<List<Integer>> ans = new ArrayList<>();
        int j = 0;
        for(int i=0; i<nums1.length; i++){
            pq.add(new int[]{nums1[i], nums2[j], i, j, nums1[i]+nums2[j]});
        }

        while (!pq.isEmpty() && ans.size() < k){
            int curr[] = pq.poll();
            List<Integer> list = new ArrayList<>();
            list.add(curr[0]);
            list.add(curr[1]);
            ans.add(list);
            if(curr[3]+1 < nums2.length){
                pq.add(new int[]{curr[0], nums2[curr[3]+1], curr[2], curr[3]+1, curr[0]+nums2[curr[3]+1]});
            }
        }

        return ans;
    }
}
