package com.soumik.stack;
import java.util.*;
public class StackImplement {
    private int arr[];
    private int top;

    public StackImplement() {
        arr=new int[5];
        top=-1;

    }

    public  void push(int n) throws StackOverflowException{
        if(top==4){
           throw new StackOverflowException("Your stack is full");
        }
        top++;
        arr[top]=n;
    }

    public int size(){
        if(top==-1) {
            System.out.println("stack is full");
        }
            return top+1;

    }

    public  boolean isEmpty(){
        if (top==-1){
            return true;
        }else{
            return false;
        }
    }

    public  int pop(){
        if (top==-1){
            System.out.println("Stack is still empty");
        }else {
            top--;
        }
        return arr[top+1];
    }
}

class StackUse{

    public static void main(String[] args) throws StackOverflowException {
        StackImplement stack=new StackImplement();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.size());
        stack.isEmpty();
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
