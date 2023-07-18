package com.soumik.DS.soumik.DS;

import java.util.Stack;

public class Leetcode227 {
    public static void main(String[] args) {
        String s = "3+2*2";
        int ans = calculate(s);
        System.out.println(ans);
    }

    private static int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int curr = 0;
        char op = '+';
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                curr = 10*curr + (c - '0');
            }
            if(!Character.isDigit(c) && c != ' ' || i == s.length() - 1){
                if(op == '+'){
                    st.push(curr);
                }else if(op == '-'){
                    st.push(-curr);
                }else if(op == '*'){
                    st.push(st.pop() * curr);
                }else if(op == '/'){
                    st.push(st.pop() / curr);
                }
                curr = 0;
                op = c;
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }

        return sum;
    }
}
