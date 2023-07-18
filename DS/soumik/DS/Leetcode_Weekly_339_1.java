package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Leetcode_Weekly_339_1 {
    public static void main(String[] args) {
        String st = "01000111";
        int ans = findTheLongestBalancedSubstring(st);
        System.out.println(ans);
    }

    private static int findTheLongestBalancedSubstring(String s) {

        int n = s.length();

        int ans = 0;
        int count[] = new int[2];
        for(int i=0; i<n; i++){
            Arrays.fill(count, 0);
            for(int j=i+1; j<=n; j++){
                String str = s.substring(i, j);
                if(isEqual(str) && valid(str)){
                    if(ans < str.length()){
                        ans = str.length();
                    }
                }
            }
        }
        return ans;
    }

    private static boolean valid(String st) {
        int m = st.length(), idx = -1;

        for(int i=m-1; i>=0; i--){
            if(i != 0 && st.charAt(i) == '0' && st.charAt(i-1) == '1'){
                idx = i;
                break;
            }
        }
        return idx == -1;
    }

    static boolean isEqual(String s){
        int z = 0, o = 0;
        for(char c: s.toCharArray()){
            if(c == '1'){
                o++;
            }else{
                z++;
            }
        }
        return o == z;
    }
}
