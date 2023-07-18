package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode1626 {
    public static void main(String[] args) {
        int scores[] = {1,2,3,5}, ages[] = {8,9,10,1};
        int ans = bestTeamScore(scores, ages);
        System.out.println(ans);
    }

    private static int bestTeamScore(int[] scores, int[] ages) {
        int n = ages.length;
        Player players[] = new Player[n];
        for(int i=0; i<n; i++){
            players[i] = new Player(ages[i], scores[i]);
        }
        Arrays.sort(players, (a, b) -> a.score - b.score);
        int ans = 0;
        for(int i=1; i<n; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(players[j].age <= players[i].age){
                    max = Math.max(players[j].score, max);
                }
            }
            players[i].score += max;
            ans = Math.max(players[i].score,ans);
        }
        return ans;
    }
}

class Player{
    int age, score;
    Player(int a, int s){
        age = a;
        score = s;
    }
}
