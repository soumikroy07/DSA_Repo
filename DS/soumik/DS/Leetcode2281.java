package com.soumik.DS.soumik.DS;

public class Leetcode2281 {
    public static void main(String[] args) {
        int[] strength = new int[]{1,3,1,2};
        int ans = totalStrength(strength);
        System.out.println(ans);
    }

    private static int totalStrength(int[] strength) {
        long total = 0L;
        int mod = (int) 1e9+7;

        for(int i=0; i<strength.length; i++){
            int min = strength[i];
            long sum = 0L;
            for(int j=i; j<strength.length; j++){
                min = Math.min(min, strength[j]);
                sum += (long) strength[j];
                total += ((sum * min) % mod);
            }

        }

        return (int)total;
    }
}
