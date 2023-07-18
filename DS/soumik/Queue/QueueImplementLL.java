package com.soumik.DS.soumik.Queue;

import com.soumik.DS.soumik.linkList.Node;

public class QueueImplementLL<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public T front(){
        if (front==null){
            System.out.println("Queue is empty");
            return null;
        }
        return front.data;
    }

    public void enqueue(T element){
        if(front==null){
            Node<T> newNode= new Node<T>(element);
            front=newNode;
            rear=newNode;
        }
        else {
            Node<T> newNode =new Node<>(element);
            rear.next=newNode;
            rear=newNode;
        }
    }

    public T dequeue(){
        if(front==null){
            System.out.println("No value is present");
            return null;
        }else {
            Node<T> temp=front;
            front=front.next;
            temp.next=null;
            return temp.data;
        }
    }
}

class QueueUingLL{
    public static void main(String[] args) {
        QueueImplement q=new QueueImplement();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.size());
        System.out.println(q.front());
        q.dequeue();
        System.out.println(q.front());
    }
}
