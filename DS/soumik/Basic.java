package com.soumik.DS.soumik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Basic {

    public static void main(String[] args) {
        String s = "234";
        ArrayList<String> x = (ArrayList<String>) letterCombinations(s);
        System.out.println(x);
    }

    public static List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        HashMap<Character, String> map = buildMap();
        solve(digits, 0, ans, map, "");
        return ans;
    }

    private static void solve(String digits, int index, List<String> ans, HashMap<Character, String> map, String res){
        if(index == digits.length()) {
            ans.add(res);
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(int i = 0; i < letters.length(); i++){
            String newString = res + letters.charAt(i);
            solve(digits, index + 1, ans, map, newString);
        }
    }

    static HashMap<Character, String> buildMap(){
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        return map;
    }



}
