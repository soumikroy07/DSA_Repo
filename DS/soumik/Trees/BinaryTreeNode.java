package com.soumik.DS.soumik.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeNode<T> {
    public T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

class BinaryNodeUse{
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> rootLeft= new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> rootRight= new BinaryTreeNode<>(3);
//        root.left=rootLeft;
//        root.right=rootRight;


//        BinaryTreeNode<Integer> root=takeInput(true,0,false);


        BinaryTreeNode<Integer> root=inputLevelWise();

        printTree(root);

//        System.out.println("Number of Nodes are : " + countNoOfNode(root));

//        System.out.println(greaterThanX(root,2));
    }


    // Take input level wise

    public static BinaryTreeNode<Integer> inputLevelWise(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter root data ");
        int rootData=sc.nextInt();
        if (rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> child=new LinkedList<>();
        child.add(root);
        while (!child.isEmpty()){
            BinaryTreeNode<Integer> front= child.poll();
            System.out.println("Enter left child of " + front.data);
            int left=sc.nextInt();
            if(left!=-1){
                BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<>(left);
                root.left=leftChild;
                child.add(leftChild);
            }

            System.out.println("Enter right child of " + front.data);
            int right=sc.nextInt();
            if(right!=-1){
                BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<>(right);
                root.right=rightChild;
                child.add(rightChild);
            }

        }
        return root;
    }




    // Node  Greater than x

    public static int greaterThanX(BinaryTreeNode<Integer> root, int x){

        if(root==null){
            return 0;
        }
        int leftRoot = greaterThanX(root.left,x);
        int rightRoot=greaterThanX(root.right,x);
        if(root.data>x){
            return 1+leftRoot+rightRoot;
        }
        else {
            return 0+rightRoot+leftRoot;
        }
    }

    // Count no of nodes

    public static int countNoOfNode(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int countLeft= countNoOfNode(root.left);
        int countRight=countNoOfNode(root.right);
        return 1+countLeft+countRight;
    }


    // Take Input in a Binary Tree

    public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft){
        Scanner sc= new Scanner(System.in);

        if(isRoot){
            System.out.println("Enter root data");
        }else {
            if(isLeft){
                System.out.println("Enter left child of " + parentData);
            }else {
                System.out.println("Enter right child of " + parentData);
            }
        }
        int rootData=sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> rootLeft= takeInput(false,rootData,true);
        BinaryTreeNode<Integer> rootRight=takeInput(false,rootData,false);
        root.left=rootLeft;
        root.right=rootRight;
        return root;
    }


    // Print a Binary Tree

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data);
        if(root.left!=null){
            System.out.print(": L = " +root.left.data);
        }
        if (root.right!=null){
            System.out.print(", R = "+root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
}
