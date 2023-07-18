package com.soumik.DS.soumik.DS;

import java.util.*;

public class Leetcode1376 {
    static int ans = 0;
    public static void main(String[] args) {
        int manager[] = new int[]{2,2,-1,2,2,2};
        int infoTime[] = new int[]{0,0,1,0,0,0};
        int ans = numOfMinutes(manager.length, 2, manager, infoTime);
        System.out.println(ans);
    }

    private static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for(int i=0; i<n; i++){
            if(manager[i] != -1){
                if(adj.containsKey(manager[i])){
                    List<Integer> list = adj.get(manager[i]);
                    list.add(i);
                    adj.put(manager[i], list);
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    adj.put(manager[i], list);
                }
            }
        }

        dfs(adj, headID, informTime, 0);
        return ans;
    }

    static void dfs(Map<Integer, List<Integer>> adj, int headId, int info[], int curr){
        if(!adj.containsKey(headId)){
            ans = Math.max(ans, curr);
            return;
        }
        for(int employee: adj.get(headId)){
            dfs(adj, employee, info, curr+info[headId]);
        }
    }
}
