package com.soumik.linkList;

import java.util.*;
class NodeLink<T>{
    int data;
    T next;
    NodeLink(int data){
        this.data= data;
        this.next=null;
    }
}


public class UserLinkList {

    //Main function start

    public static void main(String[] args) {
        Node<Integer> head= userInput();
        Node<Integer> myNode=head;
        while (head!=null){
            System.out.print(head.data+ " ");
            head=head.next;
        }
        head=myNode;
        int n=countLength(head);
        System.out.println(n);
//        printIth(head,2);
        Node<Integer> insertList= insertLink(head,2,80);
//        while (insertList!=null){
//            System.out.println();
//            System.out.print(insertList.data+ " ");
//            insertList=insertList.next;
//        }


        Node<Integer> remove=removeDuplicate(head);
//        while (remove!=null){
//            System.out.println();
//            System.out.print(remove.data+ " ");
//            remove=remove.next;
//        }


        int mid=findMidOfLinkList(head);
//        System.out.print(mid);


        Node<Integer> node = deleteNode(head , 2);

        while (node != null){
            System.out.println(node.data+ " ");
            node = node.next;
        }
    }

    // Main function end


    // delete node of a linked list


    private static Node<Integer> deleteNode(Node<Integer> head, int i) {

        if(countLength(head) == 0 || i>countLength(head)){
            return head;
        }

        if(i == 0){
            return head.next;
        }

        Node<Integer> temp = deleteNode(head.next , i-1);

        head.next = temp;
        return head;
    }

    // Main function end


    //find middle of linklist


    public static int findMidOfLinkList(Node<Integer> head){
        Node<Integer> slow=head;
        Node<Integer> fast=head;
        while(fast.next!=null  && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow.data;
    }


    // remove duplicate
    public static Node<Integer> removeDuplicate(Node<Integer> head){
        Node<Integer> prev=head,temp=head;
        while (prev!=null){
            if(prev.data==prev.next.data){
                prev=prev.next;
            }else{
                temp.next=prev.next;
                temp=prev.next;
            }
        }
        return head;
    }


    // Insert a node in LinkList


//    public static Node<Integer> insertLink(Node<Integer>head, int pos,int data){
//        Node<Integer> temp=new Node<>(data);
//        Node<Integer> returnNode=head;
//        for (int i=0;i<pos-1;i++){
//            returnNode=returnNode.next;
//        }
//        temp.next=returnNode.next;
//        returnNode.next=temp;
//        return head;
//    }


    //insert a node in LinkList using recursion

    public static Node<Integer> insertLink(Node<Integer>head, int pos,int data){
        if(pos==0){
            Node<Integer> newNode= new Node<>(data);
            newNode.next=head;
            return newNode;
        }
        head.next=insertLink(head.next,pos-1,data);
        return head;
    }


    //Print any Node of a LinkList

    public static void printIth(Node<Integer> head,int n){
        int j=0;
        Node<Integer> tail=head;
        while(j<n){
            j++;
            tail=tail.next;
        }
        System.out.println(tail.data);
    }


    // Count Node of a LinkList
    public static int countLength(Node<Integer> head){
        Node<Integer> tail=head;
        int count=0;
        while(tail!=null){
            count++;
            tail=tail.next;
        }
        return count;
    }


    // Take user input of LinkList
    public static Node<Integer> userInput(){
        Scanner sc= new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer> Head=null;
        while (data!=-1){
            Node<Integer> newNode= new Node<>(data);
            if (Head==null){
                Head=newNode;
            }else {
                Node<Integer> tail=Head;
                while (tail.next!=null){
                    tail=tail.next;
                }
                tail.next=newNode;
            }
            data= sc.nextInt();
        }
        return Head;
    }



}
