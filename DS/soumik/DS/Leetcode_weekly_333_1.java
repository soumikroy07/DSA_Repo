package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_weekly_333_1 {
    public static void main(String[] args) {
        int[][] nums1 = new int[][]{{1,2},{2,3},{4,5}};
        int[][] nums2 = new int[][]{{1,4},{3,2},{4,1}};
        int[][] ans = solveIt(nums1,nums2);
        for (int[] a : ans){
            System.out.println(a[0] + " " + a[1]);
        }
    }

    private static int[][] solveIt(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int len1 = nums1.length, len2 = nums2.length;
        int i = 0, j = 0;
        while(i < len1 && j < len2){
            if(nums1[i][0] < nums2[j][0]){
                list.add(nums1[i]);
                i++;
            }else if(nums1[i][0] > nums2[j][0]){
                list.add(nums2[j]);
                j++;
            }else{
                int val = nums1[i][1] + nums2[j][1];
                list.add(new int[]{nums1[i][0], val});
                i++;
                j++;
            }
        }
        while(i < len1){
            list.add(nums1[i++]);
        }
        while(j < len2){
            list.add(nums2[j++]);
        }
        int len = list.size(), k=0;
        int ans[][] = new int[len][2];
        for(int l[] : list){
            ans[k++] = l;
        }
        return ans;
    }
}
