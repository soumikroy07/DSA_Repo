package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CamelCasePatternMatching {
    public static void main(String[] args) {
        String str[] = new String[]{"Hi", "Hello", "HelloWorld", "HiTech", "HiGeek",
                "HiTechWorld", "HiTechCity", "HiTechLab"};
        ArrayList<String> ans = CamelCase(str, "HT");
        System.out.println(ans);
    }

    private static ArrayList<String> CamelCase(String[] str, String pattern) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s: str){
            String st = "";
            for(char c: s.toCharArray()){
                if((int)c < 91 && (int)c > 64){
                    st += c;
                    if(map.get(st) == null){
                        ArrayList<String> list = new ArrayList<>();
                        list.add(s);
                        map.put(st, list);
                    }else{
                        ArrayList<String> list = map.get(st);
                        list.add(s);
                        map.put(st, list);
                    }
                }
            }

        }

        for(Map.Entry<String, ArrayList<String>> m: map.entrySet()){
            if(m.getKey().equals(pattern)){
                return m.getValue();
            }
        }
        return new ArrayList<String>();
    }
}
