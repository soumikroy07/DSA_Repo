package com.soumik.DS.soumik.DS;


public class GFG_POTD_26 {
    public static void main(String[] args) {
        int frogs[] = new int[]{1, 3, 5};
        int ans = unvisitedLeaves(3, 6, frogs);
        System.out.println(ans);
    }

    private static int unvisitedLeaves(int n, int level, int[] frogs) {
        int levels[] = new int[level+1];
        for(int frog : frogs){
            int i = 1, num = frog;
            while(num <= level){
                levels[num] = 1;
                num = frog * i;
                i++;
            }
        }

        int count = 0;
        for(int i=1; i<=level; i++){
            if(levels[i] == 0){
                count++;
            }
        }
        return count;
    }
}
