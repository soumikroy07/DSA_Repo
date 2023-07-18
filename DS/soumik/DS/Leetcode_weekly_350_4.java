package com.soumik.DS.soumik.DS;

import java.util.PriorityQueue;

public class Leetcode_weekly_350_4 {
    public static void main(String[] args) {
        int time[] = new int[]{1,1,1,1,2,2,2,1};
        int cost[] = new int[]{26,53,10,24,25,20,63,51};
        int ans = paintWalls(cost, time);
        System.out.println(ans);
    }

    private static int paintWalls(int[] cost, int[] time) {
        PriorityQueue<int[]> paid = new PriorityQueue<>((a, b) -> a[0]/a[1] - b[0]/b[1] == 0 ? a[0] - b[0] : a[0]/a[1] - b[0]/b[1] );
        PriorityQueue<int[]> free = new PriorityQueue<>((a, b) -> b[0]/b[1] - a[0]/a[1] == 0 ? b[0] - a[0] : b[0]/b[1] - a[0]/a[1]);

        for(int i=0; i< cost.length; i++){
            int arr[] = new int[]{cost[i], time[i]};
            paid.add(arr);
            free.add(arr);
        }

//        for (int i=0; i< cost.length; i++){
//            free.add(new int[]{cost[i], time[i]});
//        }

        int ans = 0;
        while (!paid.isEmpty() && !free.isEmpty()){
            int task[] = paid.poll();
            free.remove(task);
            int timeTaken = task[1];
            ans += task[0];
            while (timeTaken-- > 0){
                int task1[] = free.poll();
                paid.remove(task1);
            }
        }

        return ans;
    }
}
