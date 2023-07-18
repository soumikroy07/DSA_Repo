package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode1239 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("un");
        arr.add("iq");
        arr.add("ue");
        int ans = maxLength(arr);
        System.out.println(ans);
    }

    private static int maxLength(List<String> arr) {
        int ans = 0;
        for(int i=0; i<arr.size(); i++){
            String temp = arr.get(i);
            for(int j=0; j<i; j++){
                temp += arr.get(j);
                if(isUnique(temp)){
                    ans = Math.max(temp.length(), ans);
                }
            }
        }
        return ans;
    }

    static boolean isUnique(String temp){
        HashSet<Character> set = new HashSet<>();
        for(char c : temp.toCharArray()){
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
