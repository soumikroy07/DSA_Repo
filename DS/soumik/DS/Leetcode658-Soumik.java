package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

//public class Leetcode658 {
//    public static void main(String[] args) {
//        int arr[] = new int[]{1,1,1,10,10,10};
//        int k = 1, x = 9;
//
//        List<Integer> ans = findClosestElements(arr, k, x);
//        System.out.println(ans);
//    }

//    private static List<Integer> findClosestElements(int[] arr, int k, int x) {
//        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
//            if(a.dif == b.dif){
//                return b.number - a.number;
//            }else{
//                return b.dif - a.dif;
//            }
//        });
//
//        for(int i : arr){
//            pq.add(new Pair(i, Math.abs(i-x)));
//
//            if(pq.size() > k){
//                pq.poll();
//            }
//        }
//        List<Integer> list = new ArrayList<>();
//        while(!pq.isEmpty()){
//            list.add(pq.poll().number);
//        }
//
//        Collections.sort(list);
//        return list;
//    }
//}

//class Pair{
//    int number, dif;
//
//    Pair(int n, int d){
//        number = n;
//        dif = d;
//    }
//}
