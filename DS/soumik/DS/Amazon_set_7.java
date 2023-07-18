package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.List;

public class Amazon_set_7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(10);
        list.add(3);
        list.add(7);

        int ans = getHigher(list);
        System.out.println(ans);
    }

    private static int getHigher(List<Integer> list) {

        int i = list.size() - 1;
        int res = 0;
        while(i > 0){
            if(list.get(i) > list.get(i-1)){
                int sum = list.get(i) + list.get(i-1);
                list.remove(i);
                list.add(i-1,sum);
                if(res < sum){
                    res = sum;
                }
            }
            i--;
        }
        return res;
    }
}
