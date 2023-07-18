package com.soumik.DS.soumik.DS;

import java.util.ArrayList;
import java.util.Collections;

public class GFG_POTD_17_OCT {
    public static void main(String[] args) {
        int arr[] = {2, 6, 9, 1, 3, 2};
        ArrayList<Integer> list = findLeastGreater(arr.length, arr);
        System.out.println(list);
    }

    static TreeNode node = null;
    static TreeNode successor = null;
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here

        ArrayList<Integer> list = new ArrayList<>();


        for(int i=n-1; i>=0; i--){
            successor = null;
            node = insert(node, arr[i]);

            if(successor == null){
                list.add(-1);
            }else{
                list.add(successor.data);
            }
        }

        Collections.reverse(list);
        return list;
    }

    static TreeNode insert(TreeNode node, int data){
        if(node == null){
            node = new TreeNode(data);

        }

        if(data < node.data){
            successor = node;
            node.left = insert(node.left, data);
        }else if(data > node.data){
            node.right = insert(node.right, data);
        }

        return node;
    }
}
class TreeNode{
    int data;
    TreeNode left, right;

    TreeNode(int d){
        data = d;
        left = null;
        right = null;
    }
}