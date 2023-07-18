package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        pq.add(5);
        ArrayList<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.remove() - 1);
        }

        System.out.println(list);
    }
}
