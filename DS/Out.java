package com.soumik.DS;
import java.util.*;
public class Out {
    public static void main(String[] args) {
//        int a[] = {1,3,0,5,8,5};
//        int b[] = {2,4,6,7,9,9};
//        int x =

        int arr[] = {9,6,5,1};
        int a = 11;
        int x =  coinChange(arr,a);
        System.out.println(x);
    }
    public static int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        for(int i=1;i<=amount;i++){
            int min = Integer.MAX_VALUE;
            for(int coin:coins){
                if(i-coin>=0 && dp[i-coin] != -1)
                    min = Math.min(dp[i - coin], min);
            }
            // Set dp[i] to -1 if i (current amount) can not be reach by  coins array
            dp[i] = min== Integer.MAX_VALUE ? -1 : 1+min;
        }
        return dp[amount];
    }


    public static int maxMeetings(int start[], int end[])
    {
        // add your code here
        ArrayList<Meeting> meetings = new ArrayList<>();
        for(int i=0;i<end.length; i++){
            meetings.add(new Meeting(start[i],end[i],i+1));
        }

//        ComparatorMeeting mc = new ComparatorMeetings();
        Collections.sort(meetings, (a,b) -> a.end - b.end);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(meetings.get(0).pos);
        int limit = meetings.get(0).end;

        for(int i=1;i<meetings.size();i++){
            if(meetings.get(i).start > limit){
                limit = meetings.get(i).end;
                ans.add(meetings.get(i).pos);
            }
        }

        return ans.size();
    }
}
class Meeting{
    int start;
    int end;
    int pos;

    Meeting(int s, int e, int p){
        start = s;
        end = e;
        pos = p;
    }
}

class ComparatorMeeting implements Comparator<Meeting>{

    public int compare(Meeting o1, Meeting o2){
        if(o1.end < o2.end){
            return -1;
        }
        else if(o1.end > o2.end){
            return 1;
        }
        else if(o1.pos < o2.pos){
            return -1;
        }
        return 1;
    }
}
