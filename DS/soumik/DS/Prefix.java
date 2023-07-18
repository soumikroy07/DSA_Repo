package com.soumik.DS.soumik.DS;

import java.util.Arrays;

public class Prefix {
    public static void main(String[] args) {
        String str[] = {"flower","flow", "flight"};
        String ans = longestCommonPrefix(str);
        System.out.println(ans);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}
