package com.soumik.DS.soumik.DS;


import java.util.Collections;
import java.util.PriorityQueue;

public class Amazon_set_14_1 {
    public static void main(String[] args) {
        int arr[] = new int[] {2,7,4,3}, k = 4;
        int ans = getHealth(arr, k);
        System.out.println(ans);
    }

    private static int getHealth(int[] arr, int k) {
        int ans = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : arr){
            maxHeap.add(i);
        }

        while (!maxHeap.isEmpty()){
            int curr = maxHeap.poll();

            if(curr <= k){
                k = -1;
                continue;
            }
            ans += curr;
        }

        return ans+1;
    }
}
