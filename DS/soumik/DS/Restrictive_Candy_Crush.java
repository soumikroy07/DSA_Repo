package com.soumik.DS.soumik.DS;

import java.util.Stack;

public class Restrictive_Candy_Crush {
    public static void main(String[] args) {
        String s = "geegsforgeeeks";
        int k = 2;
        String ans = reduced_String(s, k);
        System.out.println(ans);
    }

    private static String reduced_String(String s, int k) {
        Stack<Character> st = new Stack<>();
        if(k==1){
            return "";
        }
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int count =1;
            if(st.size()==0){
                st.push(ch);
            }
            else if(st.peek()==ch){
                while(st.size()>0 && st.peek()==ch &&count<=k){
                    st.pop();
                    count++;
                }
                if(count!=k){
                    for(int j=0;j<count;j++){
                        st.push(ch);
                    }
                }
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder ans= new StringBuilder();
        while(st.size()>0){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
