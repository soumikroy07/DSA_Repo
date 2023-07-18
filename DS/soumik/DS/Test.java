package com.soumik.DS.soumik.DS;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {
        Node root;
        Test tree = new Test();
        root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(30);
        root.right.right.right = new Node(40);

        System.out.println("maximum path sum is : " +
                tree.maxPathSum(root));
    }

    public static int maxPathSum(Node root) {
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }

    public static int maxPathDown(Node node, int maxValue[]) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left, maxValue));
        int right = Math.max(0, maxPathDown(node.right, maxValue));
        maxValue[0] = Math.max(maxValue[0], left + right + node.data);
        return Math.max(left, right) + node.data;
    }

}

class Node{
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
