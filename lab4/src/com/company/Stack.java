package com.company;

public class Stack {
    private Node head=null;
    private int size=0;
    public int length;
    char chars[];

    public void push(char n)
    {
        if(head==null){
            head=new Node(n);
        }
        else{
            Node tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next=new Node(n);
        }
        size++;
    }
    public char pop(){
        char data = ' ';
        if(head==null){
            System.out.println("Stack is empty");
        } else if (head.next==null){
            data=head.data;
            head=null;
            size--;
        } else {  Node tmp = head;
            while(tmp.next!=null) {
                tmp = tmp.next;
            }
            data=tmp.data;
            tmp=null;
            size--;
        }
       return data;
    }

    boolean isEmpty(){
        return size == 0;
    }

}

