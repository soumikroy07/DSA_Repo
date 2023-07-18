package com.soumik.DS.soumik.DS;

import java.util.HashMap;
import java.util.Map;

public class GFG_Weekly82_2 {
    public static void main(String[] args) {
        int a[] = {3 ,3 ,4 ,2 ,5 ,5 ,4 ,5 ,3}, x = 1;
        long ans = goodSubarrays(a, a.length, x);
        System.out.println(ans);
    }

    private static long goodSubarrays(int[] a, int n, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0L;
        int left = 0;
        for(int i=0; i<n; i++){
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            while(isValid(map, x)){
                count++;
                map.put(a[left], map.get(a[left])-1);
                if(map.get(a[left]) == 0){
                    map.remove(a[left]);
                }
                left++;
            }
        }

        return count;
    }

    static boolean isValid(HashMap<Integer, Integer> map, int counts){
        if(map.size() < counts){
            return false;
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() >= 3){
                count++;
            }
        }
        return count == counts;
    }
}
