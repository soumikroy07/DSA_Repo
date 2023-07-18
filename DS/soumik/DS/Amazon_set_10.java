package com.soumik.DS.soumik.DS;

public class Amazon_set_10 {
    public static void main(String[] args) {
        int numberOfBricks = 10;
        int ans[] = bricksAndWinner(numberOfBricks);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    private static int[] bricksAndWinner(int numberOfBricks) {
        int ans[] = new int[2];
        int turn = 1, john = 1, jack = 2;

        while(numberOfBricks >= 0){

            if(numberOfBricks > turn){
                numberOfBricks -= turn;
            }else {
                ans[0] = john;
                ans[1] = numberOfBricks;
                break;
            }

            if (numberOfBricks > 2 * turn){
                numberOfBricks -= (2 * turn);
            }else {
                ans[0] = jack;
                ans[1] = numberOfBricks;
                break;
            }
            turn++;
        }

        return ans;
    }
}
