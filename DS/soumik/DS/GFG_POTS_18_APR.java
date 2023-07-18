package com.soumik.DS.soumik.DS;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class GFG_POTS_18_APR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        Job arr[] = new Job[]{new Job(1 ,6, 30 ), new Job(2, 6, 50),
                            new Job(3,6,20), new Job(4,1,10),
                            new Job(5,5,50), new Job(6, 4, 50)};

        int[] ans = JobScheduling(arr);
        for (int i: ans){
            System.out.print(i + " ");
        }
    }

    private static int[] JobScheduling(Job[] arr) {
        PriorityQueue<Job> pq = new PriorityQueue<>((a, b) -> b.profit - a.profit);
        // int time = 0;
        for(Job a : arr){
            pq.add(a);
        }
        Set<Integer> set = new HashSet<>();

        int jobs = 0, profits = 0;
        while(!pq.isEmpty()){
            Job curr = pq.poll();
            int time = curr.deadline;
            while(time > 0 && set.contains(time)){
                time--;
            }
            if(!set.contains(time)){
                jobs++;
                set.add(time);
                profits += curr.profit;
            }
        }

        int ans[] = new int[]{jobs, profits};
        return ans;
    }
}

class Job{
    int id, deadline, profit;

    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
