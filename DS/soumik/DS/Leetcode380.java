package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Leetcode380 {
    public static void main(String[] args) {
        RandomizedSet rand = new RandomizedSet();
        System.out.println(rand.insert(0));

        System.out.println(rand.insert(1));
        System.out.println(rand.remove(0));
        System.out.println(rand.insert(2));
        System.out.println(rand.remove(1));
        System.out.println(rand.getRandom());


//        System.out.println(rand.getRandom());
    }
}

class RandomizedSet {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    int idx = 0;
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        Integer num = map.get(val);
        if(num == null){
            list.add(val);
            map.put(val, idx);
            idx++;
        }else{
            return false;
        }

        return true;
    }

    public boolean remove(int val) {

        Integer num = map.get(val);
        if(num == null){
            return false;
        }else{
            swap(list, num, idx-1);
            int delete = list.get(idx-1);
            map.remove(delete);
            map.put(list.get(num), num);
            list.remove(idx-1);
            idx--;
        }
        return true;
    }

    public int getRandom() {
        Random random = new Random();
        int n = random.nextInt(list.size());
        return list.get(n);
    }

    void swap(ArrayList<Integer> list, int idx1, int idx2){
        int num = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, num);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */