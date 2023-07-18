package com.soumik.DS.soumik.DS;

import java.util.Stack;

public class Leetcode946 {
    public static void main(String[] args) {
        int pushed[] = new int[]{1,2,3,4,5};
        int popped[] = new int[]{4,5,3,2,1};
        boolean ans = validateStackSequences(pushed, popped);
        System.out.println(ans);
    }

    private static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int i=0;
        for(int val: pushed){
            while(!st.isEmpty() && st.peek() == popped[i]){
                st.pop();
                i++;
            }
            st.push(val);
        }
        while(!st.isEmpty() && st.peek() == popped[i]){
            st.pop();
            i++;
        }
        return st.isEmpty();
    }
}
