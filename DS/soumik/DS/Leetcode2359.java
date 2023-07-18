package com.soumik.DS.soumik.DS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode2359 {
    public static void main(String[] args) {
        int edges[] = new int[]{2,2,3,-1}, node1 = 0, node2 = 1;
        int ans = closestMeetingNode(edges, node1, node2);
        System.out.println(ans);
    }

    private static int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        // boolean visited[] = new boolean[n];
        int dist1[] = new int[n];
        Arrays.fill(dist1, Integer.MAX_VALUE);
        dist1[node1] = 0;

        int dist2[] = new int[n];
        Arrays.fill(dist2, Integer.MAX_VALUE);
        dist2[node2] = 0;

        for(int i=0; i<n; i++){
            dist1[i] = getDist(node1, i, edges, new boolean[n]);
            dist2[i] = getDist(node2, i, edges, new boolean[n]);
        }

        int distance = Integer.MAX_VALUE, ans = -1;

        for(int i=0; i<n; i++){
            int temp = Math.max(dist1[i], dist2[i]);
            if(temp < distance){
                ans = i;
                distance = temp;
            }
        }

        return ans;
    }

    private static int getDist(int src, int dest, int[] edges, boolean[] visited) {
        visited[src] = true;
        if(src == dest) return 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        int steps = 0;
        while (!q.isEmpty()){
            int size = q.size();
            while (size-- > 0){
                int curr = q.poll();
                if (curr == dest){
                    return steps;
                }
                visited[curr] = true;
                if(edges[curr] == -1 || visited[edges[curr]])
                    continue;

                q.add(edges[curr]);
            }
            steps++;
        }
        return Integer.MAX_VALUE;
    }
}
