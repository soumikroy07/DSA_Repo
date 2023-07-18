package com.soumik.DS.soumik.DS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Leetcode_contest_88 {
    public static void main(String[] args) {
        String word = "aacc";
        boolean ans = possible(word);
        System.out.println(ans);
    }

    private static boolean possible(String word) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : word.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(Map.Entry<Character, Integer> m : map.entrySet()){
            set.add(m.getValue());
        }

        if(set.size() > 2 || set.size() == 1) return false;

        int flag = 0;

        for(int i : set){
            if(flag == 0){
                flag = i;
                continue;
            }

            if(Math.abs(flag - i) > 1 || Math.abs(flag - i) == 0){
                return false;
            }
        }

        return true;
    }
}
