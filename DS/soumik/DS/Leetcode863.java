package com.soumik.DS.soumik.DS;

import java.util.*;

public class Leetcode863 {
    static Map<TNode, TNode> map = new HashMap<>();
    static Set<TNode> set = new HashSet<>();

    public static void main(String[] args) {
        TNode root = new TNode(3);
        root.left = new TNode(5);
        root.right = new TNode(1);
        root.left.left = new TNode(6);
        root.left.right = new TNode(2);
        root.right.left = new TNode(0);
        root.right.right = new TNode(8);
        root.left.right.left = new TNode(7);
        root.left.right.right = new TNode(4);

        List<Integer> ans = distanceK(root, root.left, 2);
        System.out.println(ans);
    }

    private static List<Integer> distanceK(TNode root, TNode target, int k) {
        buildParent(root);
        Queue<TNode> q = new LinkedList<>();
        q.add(target);
        set.add(target);
        while(!q.isEmpty() && k > 0){
            int size = q.size();
            while(size-- > 0){
                TNode curr = q.poll();
                if(curr.left != null && !set.contains(curr.left)){
                    q.add(curr.left);
                    set.add(curr.left);
                }
                if(curr.right != null && !set.contains(curr.right)){
                    q.add(curr.right);
                    set.add(curr.right);
                }

                TNode parent = map.get(curr);
                if(parent != null && !set.contains(parent)){
                    q.add(parent);
                    set.add(parent);
                }
            }
            k--;
        }

        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }

        return ans;
    }

    public static void buildParent(TNode root){
        if(root == null){
            return;
        }
        if(root.left != null){
            map.put(root.left, root);
            buildParent(root.left);
        }

        if(root.right != null){
            map.put(root.right, root);
            buildParent(root.right);
        }
    }
}

class TNode{
    int val;
    TNode left, right;
    TNode(int v, TNode l, TNode r){
        val = v;
        left = l;
        right = r;
    }
    TNode(int v){
        val = v;
    }
}
