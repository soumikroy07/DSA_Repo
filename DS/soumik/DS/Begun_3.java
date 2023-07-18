package com.soumik.DS.soumik.DS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Begun_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), k = sc.nextInt();
        int n = 4, k = 1;
        int arr[] = new int[]{1,1,2,1};
//        for (int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }

        Map<Integer, Integer> map = new HashMap<>();
        int pre[] = new int[n];

        for (int i=0; i<n; i++){
            int a = arr[i];
            pre[i] = map.get(a) != null ? map.get(a) : 0;
            map.put(a, map.getOrDefault(a, 0)+1);
        }

        int post[] = new int[n];
        map.clear();
        for (int i=n-1; i>=0; i--){
            int a = arr[i];
            post[i] = map.get(a) != null ? map.get(a) : 0;
            map.put(a, map.getOrDefault(a, 0)+1);
        }

        for(int i=0; i<n; i++){
            if(arr[i] == k && pre[i] == post[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
