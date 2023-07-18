package com.soumik.linkList;

public class Node<T> {
    public Node<T> next;
    public T data;
    public Node(T data){
        this.data=data;
        next=null;
    }
}
 class UseNode{
    public static void main(String[] args) {
        Node<Integer> head= buildNode();
        while (head!= null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static Node<Integer> buildNode(){
        Node<Integer> n1= new Node<>(10);
        Node<Integer> n2= new Node<>(20);
        Node<Integer> n3= new Node<>(30);
        Node<Integer> n4= new Node<>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
}
