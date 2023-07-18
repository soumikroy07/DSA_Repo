package com.soumik.DS.soumik.DS;

import java.util.TreeSet;

public class Leetcode475 {
    public static void main(String[] args) {
        int houses[] = new int[]{1, 5}, heaters[] = new int[]{10};
        System.out.println(findRadius(houses, heaters));
    }

    private static int findRadius(int[] houses, int[] heaters) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int heater : heaters){
            set.add(heater);
        }

        int ans = 0;
        for(int house : houses){
            int floor = set.floor(house) != null ? set.floor(house) : Integer.MIN_VALUE;
            int ceil = set.ceiling(house) != null ? set.ceiling(house) : Integer.MAX_VALUE;
            int distance = Math.min(Math.abs(house - floor), ceil - house);
            ans = Math.max(ans, distance);
        }

        return ans;
    }
}
