package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Leetcode1268 {
    public static void main(String[] args) {
        String products[] = new String[]{"mobile","mouse","moneypot","monitor","mousepad"};
        String search = "mouse";
        List<List<String>> ans = suggestedProducts(products, search);
        System.out.println(ans);
    }

    private static List<List<String>> suggestedProducts(String[] products, String search) {
        Arrays.sort(products);
        TreeMap<String, Integer> map = new TreeMap<>();
        List<List<String>> ans = new ArrayList<>();
        List<String> productList = Arrays.asList(products);

        for(int i=0; i<products.length; i++){
            map.put(products[i], i);
        }

        String key = "";
        for(char c : search.toCharArray()){
            key += c;
            String celling = map.ceilingKey(key);
            String floor = map.floorKey(key+'{');

            if(celling == null || floor == null){
                break;
            }
            ans.add(productList.subList(map.get(celling), Math.min(map.get(floor)+1, map.get(celling)+3)));


        }
        while(ans.size() < search.length()) ans.add(new ArrayList<>());

        return ans;
    }
}
