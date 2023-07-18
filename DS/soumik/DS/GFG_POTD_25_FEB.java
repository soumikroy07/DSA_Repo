package com.soumik.DS.soumik.DS;

public class GFG_POTD_25_FEB {
    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS", t = "G7G3S";
        int ans = checkCompressed(s, t);
        System.out.println(ans);
    }

    private static int checkCompressed(String s, String t) {
        int i=0, j=0;
        while(i < s.length() && j < t.length()){
            char c_t = t.charAt(j);
            if(Character.isDigit(c_t)){
                int val = c_t - '0';
                i += val;
                j++;
            }else{
                if(s.charAt(i) != t.charAt(j)){
                    return 0;
                }
                i++;
                j++;
            }
        }
        return 1;
    }
}
