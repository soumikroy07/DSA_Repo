package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class GFG_POTD_13_MAR {
    public static void main(String[] args) {
        int a[] = new int[]{3, 4, 6, 5};
        int b[] = new int[]{2,3,1,6};
//        ArrayList<Integer> list = solveQueries(a.length, q.length, a, q);
        long ans = maxPossibleValue(4, a, b);
        System.out.println(ans);
    }

    private static long maxPossibleValue(int n, int[] a, int[] b) {
        PriorityQueue<Sticks> pq = new PriorityQueue<>((x, y) -> y.length - x.length);
        for(int i=0; i<n; i++){
            pq.add(new Sticks(a[i], b[i]));
        }

        long ans = 0L;
        while(!pq.isEmpty()){
            Sticks first = null, second = null;
            while(!pq.isEmpty() && pq.peek().unit <= 1){
                pq.poll();
            }
            if(!pq.isEmpty()){
                first = pq.poll();
                pq.add(new Sticks(first.length, first.unit-2));
            }

            while(!pq.isEmpty() && pq.peek().unit <= 1){
                pq.poll();
            }
            if(!pq.isEmpty()){
                second = pq.poll();
                pq.add(new Sticks(second.length, second.unit-2));
            }

            if(second != null){
                ans += ((long) 2 * (first.length + second.length));
            }
        }
        return ans;
    }
}

class Sticks{
    int length, unit;
    Sticks(int l, int u){
        length = l;
        unit = u;
    }
}
