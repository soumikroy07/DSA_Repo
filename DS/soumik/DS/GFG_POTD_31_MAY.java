package com.soumik.DS.soumik.DS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GFG_POTD_31_MAY {
    public static void main(String[] args) {
        int arr[] = new int[]{2 ,2 ,5 ,50 ,1 ,5 ,50};
        int ans = LargButMinFreq(arr);
        System.out.println(ans);
    }

    private static int LargButMinFreq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int a : arr){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int freq[][] = new int[map.size()][2], i=0;
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            freq[i][0] = m.getKey();
            freq[i][1] = m.getValue();
            i++;
        }

        Arrays.sort(freq, (a, b) -> a[1] < b[1] ? b[1] - a[1] : b[0] - a[0]);
        return freq[0][0];
    }
}
