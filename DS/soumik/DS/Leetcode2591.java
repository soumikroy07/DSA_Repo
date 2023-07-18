package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode2591 {
    public static void main(String[] args) {
        int ans = distMoney(13, 3);
        System.out.println(ans);
    }

    private static int distMoney(int money, int children) {
        if(money < children){
            return -1;
        }
        int arr[] = new int[children];
        Arrays.fill(arr, 1);
        money = money - children;
        int i = 0;
        while(money > 0){
            if(money >= 7){
                arr[i++] += 7;
                money -= 7;
            }else {
                arr[i++] += money;
                money = 0;
            }
        }

        if(money > 0){
            arr[0] += money;
        }

        int eight=0, four = 0, one = 0;
        for(int a: arr){
            if(a == 8){
                eight++;
            }
            else if(a == 4){
                four++;
            } else if (a == 1) {
                one++;
            }
        }
        if (one > 0 && four> 0){
            four -= one;
        }

        return eight == 0? 0 : four > 0? eight - four: eight;

    }
}
