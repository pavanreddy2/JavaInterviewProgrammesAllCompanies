package com.ar.MyInterview;

//Node Class:  defines a basic element in a linked list.
                //Each Node holds a value (data) & a reference (next) to the next code in the list.
class Node {
    int data;   //Store the value of the Node
    Node next;  //Points to the next node in the list

    Node (int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedExample {
    Node head;
    LinkedExample(){
        head = null;
    }
    //use append method to create the data
    public void append (int data){
        Node newNode = new Node(data);

        //only run once and it will exist
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
             current = current.next;
        }
        current.next = newNode;
    }

    //To display the Node
    public void display (){
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
    LinkedExample example = new LinkedExample();
    example.append(1);
    example.append(2);
    example.append(3);

    example.display();
    }
}
