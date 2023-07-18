package com.soumik.DS.soumik.DS;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1146 {
    public static void main(String[] args) {
        SnapshotArray snapshotArr = new SnapshotArray(3);
        snapshotArr.set(0,5);
        System.out.println(snapshotArr.snap());
        snapshotArr.set(0,6);
        System.out.println(snapshotArr.get(0,0));
    }
}
class SnapshotArray {
    Map<Integer, int[]> map;
    int arr[], id;
    public SnapshotArray(int length) {
        map = new HashMap<Integer, int[]>();
        arr = new int[length];
        id = 0;
    }

    public void set(int index, int val) {
        arr[index] = val;
    }

    public int snap() {
        int a[] = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            a[i] = arr[i];
        }
        map.put(id, a);
        id++;
        return id-1;
    }

    public int get(int index, int snap_id) {
        return map.get(snap_id)[index];
    }
}
