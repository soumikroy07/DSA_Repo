package com.soumik.DS.soumik.DS;

public class Leetcode_weekly_349_2 {
    public static void main(String[] args) {
        String ans = smallestString("aa");
        System.out.println(ans);
    }

    private static String smallestString(String s) {
        String str[] = s.split("a");
        int i = 0, count = 0;
        String ans = "";
        for(i=0; i<str.length; i++){
            String st = str[i];
            if(st != "" && st.charAt(0) != 'a' && count == 0){
                count++;
                String temp = "";
                for(int j=0; j<st.length(); j++){
                    temp += (char) ((int) st.charAt(j) - 1);
                }
                ans += temp;
                ans += "a";
            }else{
                ans += st;
                ans += "a";
            }
        }

        return ans.substring(0, ans.length()-1);
    }
}
