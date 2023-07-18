package com.soumik.DS.soumik.DS;

import java.util.*;

public class GFG_POTD_19_DEC {
    public static void main(String[] args) {
        int flights[][] = {{2,1,1},{2,3,1},{3,4,1}}, k = 2, n = 4;
        int ans = minimumCost(flights, n, k);
        System.out.println(ans);
    }

    private static int minimumCost(int[][] flights, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<int[]>());
        }

        for(int flight[] : flights){
            int start = flight[0], end = flight[1], val = flight[2];
            adj.get(start).add(new int[]{end, val});
        }

        int cost[] = new int[n+1];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[k] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(k);

        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int start = q.poll();

                for(int[] element : adj.get(start)){
                    int destination = element[0];
                    int value = element[1];

                    if(cost[start] + value < cost[destination]){
                        cost[destination] = cost[start] + value;
                    }
                    q.add(destination);
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for(int i=1; i<cost.length; i++){
            int val = cost[i];
            if(val == Integer.MAX_VALUE){
                return -1;
            }else if(i == k){
                continue;
            }
            ans = Math.max(ans, val);
        }

        return ans;
    }
}
