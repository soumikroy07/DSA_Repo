package com.soumik.DS.soumik.DS;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode1475 {
    public static void main(String[] args) {
        int arr[] = {8,4,6,2,3};
        int ans[] = finalPrices(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : ans){
            System.out.print(i + " ");
        }
    }

    private static int[] finalPrices(int[] prices) {

        int n = prices.length;
        int cost[] = new int[n];
        Stack<Integer> st = new Stack<>();
        cost[n-1] = prices[n-1];
        st.push(prices[n-1]);

        for(int i=n-2; i>=0; i--){
            if(!st.isEmpty()){
                while(!st.empty() && st.peek() > prices[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    cost[i] = prices[i];
                    st.push(prices[i]);
                }
                else if(st.peek() <= prices[i]){
                    cost[i] = prices[i] - st.peek();
                    st.push(prices[i]);
                }
            }
        }

        return cost;
    }


}
