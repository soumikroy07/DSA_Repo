package com.soumik.DS.soumik.DS;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_weekly_354_4 {
    public static void main(String[] args) {
        String word = "leetcode";
        List<String> forbidden = List.of("de","le","e");
        int ans = longestValidSubstring(word, forbidden);
        System.out.println(ans);
    }

    private static int longestValidSubstring(String word, List<String> forbidden) {
        int left = 0, ans = 0;
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();

        for (String f: forbidden){
            set.add(f);
        }

        for (int i=0; i<word.length(); i++){
            sb.append(word.charAt(i));
            while (set.contains(sb.toString())){
                sb.delete(left, left);
                left++;
            }

            ans = Math.max(ans, i - left);
        }

        return ans;
    }


}
