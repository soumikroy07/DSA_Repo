package com.soumik.DS.soumik.DS;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_weekly_345_1 {
    public static void main(String[] args) {
        int ans[] = circularGameLosers(2, 1);
        for(int i : ans){
            System.out.print(i + " ");
        }
    }

    private static int[] circularGameLosers(int n, int k) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        int fr = 1, x = 0, y = 1;
        while(true){
            fr += (y*k);
            if(fr > n){
                fr = fr % n;
            }
            if(fr == 0){
                fr = n;
            }
            if(set.contains(fr)){
                break;
            }else{
                set.add(fr);
            }
            y++;
        }
        if(set.size() == n){
            return new int[0];
        }
        int ans[] = new int[n - set.size()];
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                ans[x++] = i;
            }
        }

        return ans;
    }
}
