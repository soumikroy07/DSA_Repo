package com.soumik.DS.soumik.stack;

import com.soumik.DS.soumik.linkList.Node;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;

    public StackUsingLL(){
        head=null;
        size=0;
    }

    public void push(T data){
        if(head==null){
            Node<T> newNode = new Node<>(data);
            head=newNode;
            size++;
        }else{
            Node<T> newNode = new Node<>(data);
            newNode.next=head;
            head=newNode;
            size++;
        }
    }

    public int stackSize(){
        return size;
    }

    public boolean isEmpty(){
        if (size==0){
            System.out.println("Stack is Empty");
            return true;
        }else {
            return false;
        }

    }
    public T pop(){
        T temp = null;
        if(head==null){
            System.out.println("Stack is Empty");
        }else {
            temp=head.data;
            head=head.next;
        }
        size--;
        return temp;
    }

}

class StackUseByLL{
    public static void main(String[] args) {
        StackUsingLL stack= new StackUsingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.isEmpty();
        System.out.println(stack.stackSize());
        System.out.println(stack.pop());
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.stackSize());
    }
}