package com.soumik.DS.soumik.DS;

import java.util.Stack;

public class GFG_POTD_22_MAR {
    public static void main(String[] args) {
        String s = "prpptppr";
        int ans = solve(7, 7, s);
        System.out.println(ans);
    }
    private static int solve(int X, int Y, String s) {
        int count_x = 0;
        int count_y = 0;
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i=1; i<s.length(); i++){
            if(!st.isEmpty()){
                String str = ""+st.peek()+s.charAt(i);
                if(str.equals("pr")){
                    count_x++;
                    st.pop();
                    continue;
                }
                if(str.equals("rp")){
                    count_y++;
                    st.pop();
                    continue;
                }
            }
            st.push(s.charAt(i));
        }
        return count_x * X + count_y * Y;
    }

}
