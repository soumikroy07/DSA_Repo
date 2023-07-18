package com.soumik.DS.soumik.DS;

import java.util.ArrayList;

public class Leetcode57 {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}} ;
        int newInterval[] = {4, 8};
        int ans[][] = insert(intervals, newInterval);
        for(int[] a : ans){
            System.out.println(a[0] + " " + a[1]);
        }
    }

    private static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();
        int idx = 0, n = intervals.length;
        while (idx < n){
            if(intervals[idx][0] < newInterval[0]){
                list.add(intervals[idx]);
            }else {
                break;
            }
            idx++;
        }

        if(list.size() == 0 || list.get(list.size()-1)[1] < newInterval[0]){
            list.add(newInterval);
        }else {
            int[] interval = list.get(list.size() - 1);
            interval[1] = Math.max(interval[1], newInterval[1]);
        }

        while (idx < n){
            int interval[] = list.get(list.size() - 1);
            if (interval[1] >= intervals[idx][0]){
                interval[1] = Math.max(interval[1], intervals[idx][1]);
            }else {
                list.add(intervals[idx]);
            }
            idx++;
        }
        int[] ans[] = new int[list.size()][2];
        int i = 0;
        for (int[] l : list){
            ans[i][0] = l[0];
            ans[i++][1] = l[1];
        }
        return ans;
    }
}
