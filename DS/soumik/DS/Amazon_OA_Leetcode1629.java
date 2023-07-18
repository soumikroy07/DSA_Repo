package com.soumik.DS.soumik.DS;

import java.util.PriorityQueue;

public class Amazon_OA_Leetcode1629 {
    public static void main(String[] args) {
        int times[] = {12,23,36,46,62};
        String keys =
                "spuda";
        char c = slowestKey(times, keys);
        System.out.println(c);
    }

    private static char slowestKey(int[] times, String keys) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for(int i=0; i<keys.length(); i++){
            if(i == 0){
                pq.add(new pair(times[i], keys.charAt(i)));
                continue;
            }

            pq.add(new pair(times[i] - times[i-1], keys.charAt(i)));
        }

        return pq.peek().c;

    }
}

class pair implements Comparable<pair>{
    int duration;
    char c;

    pair(int x, char ch){
        duration = x;
        c = ch;
    }

    public int compareTo(pair o){
        if(this.duration < o.duration){
            return o.duration - this.duration;
        }else if(this.duration == o.duration){
            return o.c - this.c;
        }
        return -1;
    }
}