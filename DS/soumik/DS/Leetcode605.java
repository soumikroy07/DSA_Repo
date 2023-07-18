package com.soumik.DS.soumik.DS;

public class Leetcode605 {
    public static void main(String[] args) {
        int flowerbed[] = new int[]{1,0,0,0,1,0,0};
        boolean ans = canPlaceFlowers(flowerbed, 2);
        System.out.println(ans);
    }

    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        for(int i=0; i<m && n > 0; i++){
            if(i == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0 && n > 0){
                flowerbed[i] = 1;
                n--;
            }else if(i == m - 1 && flowerbed[i] == 0 && flowerbed[i-1] == 0 && n > 0){
                flowerbed[i] = 1;
                n--;
            }else if(i != 0 && i != m-1 && flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0 && n > 0){
                flowerbed[i] = 1;
                n--;
            }
        }

        return n == 0;
    }
}
