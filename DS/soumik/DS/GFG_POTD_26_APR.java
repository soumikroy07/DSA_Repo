package com.soumik.DS.soumik.DS;

public class GFG_POTD_26_APR {
    public static void main(String[] args) {
        int seats[] = new int[]{0, 0, 1, 0, 0, 0, 1};
        boolean ans = is_possible_to_get_seats(2, 7, seats);
        System.out.println(ans);
    }

    private static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        for(int i=0; i<m; i++){
            if(i == 0){
                if(seats[i] == 0 && seats[i+1] == 0){
                    n--;
                    seats[i] = 1;
                }
            }else if(i == m-1){
                if(seats[i-1] == 0 && seats[i] == 0){
                    n--;
                    seats[i] = 1;
                }
            }else{
                if(seats[i] == 0 && seats[i-1] == 0 && seats[i+1] == 0){
                    n--;
                    seats[i] = 1;
                }
            }
        }

        return n <= 0;
    }
}
