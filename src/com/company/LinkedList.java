package com.company;

public class LinkedList {
    public Node first = null;
    public Node last = null;

    public void addFront(int num){

        Node temp = new Node(num);
        if(first == null && last == null){
            first = temp;
            last = temp;
        }else{
            temp.next = first;
            first.previous = temp;
            first = temp;
        }
    }
    public void addRear(int num){

        Node temp = new Node(num);
        if(first == null && last == null){
            first = temp;
            last = temp;
        }else{
            temp.previous = last;
            last.next = temp;
            last = temp;
        }
    }

    public void traverseFront(){
        Node current = first;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void traverseRear(){
        Node current = last;
        while(current != null){
            System.out.println(current.data);
            current = current.previous;
        }
    }
}
