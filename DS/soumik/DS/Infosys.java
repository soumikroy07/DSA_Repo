package com.soumik.DS.soumik.DS;

import java.util.TreeMap;

public class Infosys {
    public static void main(String[] args) {
        int arr[] = {1,1,2,4},k=2;
        long count = countSeq(arr, arr.length,k);
        System.out.println(count);
    }

    private static long countSeq(int[] arr, int n, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        long count = 0;
        for(int i=0; i<n; i++){
            map.put(arr[i], i);
        }
        if(map.size() == 1 && k==1){
            return arr.length;
        }
        for(int i=0; i< arr.length; i++){
            if(map.containsKey(k*arr[i]) && i < map.get(k*arr[i])){
                int nextCheck = k*arr[i];
                int nextCheckIdx = map.get(nextCheck);
                if (map.containsKey(nextCheck*k) && nextCheckIdx < map.get(nextCheck*k)){
                    count++;
                }
            }
        }
        return count;
    }
}
