package com.company;
import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(LinkedList list){
        Node front = list.first;
        Node back = list.last;
        while(front != null){
            if(front.data != back.data){
                return false;
            }
            front = front.next;
            back = back.previous;
        }
        return true;
    }
    public static void main(String[] args) {
	    LinkedList list = new LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.println("How many nodes do you want to insert");
        int n = input.nextInt();
        int i = 0;
        while(i < n){
            System.out.print("Add element: ");
            int k = input.nextInt();
            list.addRear(k);
            i++;
        }
        System.out.print(isPalindrome(list));



    }
}
