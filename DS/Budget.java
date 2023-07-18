package com.soumik.DS;

import java.util.*;
public class Budget {
    public static void main(String[] args) {
        int arr[]={34 ,78 ,90 ,15 ,67};
        int profit=budgetProfit(arr);
        System.out.println(profit);
    }
    public static int budgetProfit(int arr[]){
        Arrays.sort(arr);
        int res=0;

        for (int i=0;i< arr.length;i++){
            int profit=0;
            profit=arr[i]* (arr.length-i);
            if(res<profit){
                res=profit;
            }
        }
        return res;
    }
}
