//package com.soumik.DS.soumik.DS;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//
//public class MindTreeQustion {
//    public static void main(String[] args) {
//        int arr[][] = {{2,8}, {12,14}, {6, 10}, {16, 20}};
////        int ans = busRemaining(arr);
//        int answ = BusRemaining(arr);
//        System.out.println(answ);
//    }
//
//    private static int BusRemaining(int[][] arr) {
////        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
//        int startTime = arr[0][0], endTime = arr[0][1];
//        int count = 1;
//        for(int i=1; i<arr.length; i++){
//            if(endTime > arr[i][0]){
//                endTime = Math.max(endTime, arr[i][1]);
//            }else{
//                count++;
//                startTime = arr[i][0];
//                endTime = arr[i][1];
//            }
//        }
//        return count;
//    }
//
//    private static int busRemaining(int[][] busStation) {
//        ArrayList<Pair> list = new ArrayList<>();
//
//        for(int bus[] : busStation){
//            list.add(new Pair(bus[0], bus[1]));
//        }
//
//        Collections.sort(list);
//        int count = 1;
//        ArrayList<Pair> ans = new ArrayList<>();
//        int startTime = list.get(0).start;
//        int endTime = list.get(0).end;
//
//        for(int i=1; i<list.size(); i++){
//            if(endTime > list.get(i).start){
//                endTime = Math.max(endTime, list.get(i).end);
//            }else{
//                count++;
//                ans.add(new Pair(startTime, endTime));
//                startTime = list.get(i).start;
//                endTime = list.get(i).end;
//            }
//        }
//        ans.add(new Pair(startTime, endTime));
//
//        for (Pair an : ans){
//            System.out.println(an.start + " " + an.end);
//        }
//        return count;
//    }
//}
//
//class Pair implements Comparable<Pair>{
//    int start, end;
//
//    public Pair(int start, int end) {
//        this.start = start;
//        this.end = end;
//    }
//
//    public int compareTo(Pair o){
//        return this.start - o.start;
//    }
//
//}
