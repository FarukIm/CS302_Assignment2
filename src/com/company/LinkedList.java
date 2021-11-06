package com.company;

public class LinkedList {
    public Node first;
    public Node last;
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
}
