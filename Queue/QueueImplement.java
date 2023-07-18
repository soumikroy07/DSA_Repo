package com.soumik.Queue;

public class QueueImplement {
    private int arr[];
    private int front;
    private int rear;
    private int size;

    public QueueImplement() {
        arr = new int[5];
        front = -1;
        rear = -1;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int front(){
        if(front==-1){
            System.out.println("Your queue is empty");
            return 0;
        }else {
            return arr[front];
        }
    }

    public void enqueue(int element){
        if (front==-1){
            front++;
            rear++;
            size++;
            arr[front]=element;
        }else {
            rear++;
            if(rear==arr.length){
                rear=0;
            }
            arr[rear]=element;
            size++;
        }
    }
    public int dequeue(){
        if(front==-1){
            System.out.println("No element is present to delete");
            return 0;
        }else {
            int temp=arr[front];
            front++;
            if(front== arr.length){
                front=0;
            }
            size--;
            if (size==0){
                front=-1;
                rear=-1;
            }
            return temp;
        }
    }
}

class QueueUse{
    public static void main(String[] args) {
        QueueImplement q=new QueueImplement();
        System.out.println(q.size());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.front());
        System.out.println(q.size());
    }
}
