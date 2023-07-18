package com.soumik.DS.soumik.DS;

public class MinCoinRequired {
    public static void main(String[] args) {
        int amount = 11;
        int arr[] = new int[]{1, 5, 7};
        int ans = minCoins(arr, amount);
        System.out.println(ans);
    }

    private static int minCoins(int[] arr, int amount) {
        helper(arr, amount, 0);
        return min;
    }
    static int min = Integer.MAX_VALUE;
    static void helper(int arr[], int amount, int coin){
//        if(i >= arr.length){
//            return;
//        }
        if(amount < 0){
            return;
        }

        if(amount == 0){
            min = Math.min(min, coin);
            return;
        }

        for(int i=0; i<arr.length; i++){
            helper(arr, amount-arr[i], coin+1);
        }
    }
}
