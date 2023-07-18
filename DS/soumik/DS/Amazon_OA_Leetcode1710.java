package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Amazon_OA_Leetcode1710 {
    public static void main(String[] args) {
        int boxTypes[][] = {{1,3},{2,2},{3,1}}, truckSize = 4;
        int ans = maximumUnits(boxTypes, truckSize);
        System.out.println(ans);
    }

    private static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int unit = 0;
        for(int box[] : boxTypes){
            if(truckSize > box[0]){
                truckSize -= box[0];
                unit += (box[1]*box[0]);
            }else{
                int taken = truckSize;
                unit += (taken * box[1]);
                break;
            }
        }

        return unit;
    }
}
