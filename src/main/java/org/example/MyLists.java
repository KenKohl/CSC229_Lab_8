package org.example;

/**
 * MyLists class implements the SinglyLinkedList interface and defines the methods from the interface.
 *
 * Author: Ken Kohlhof
 * Assignment: Lab 8
 */
public class MyLists implements SinglyLinkedList{

    class Node{
        int n;
        Node next;

        public Node(int n){
            this.n = n;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;


    //Method that adds a node to a singly linked list.
    @Override
    public void addNode(int n) {
        Node newNode = new Node(n);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next=newNode;
            tail= newNode;
        }

    }

    //Method that gets a node from a singly linked list
    @Override
    public int getNode(int n) {
        Node current = head;
        if(head == null){
            return -1;
        }
        else{
            while(current != null){
                if(current.n == n){
                    return n;
                }
                current=current.next;
            }
        }
        return -1;
    }


    //Method gets the contents of a singly linked list.Used for testing.
    @Override
    public void getList() {
        Node current = head;

        if(head == null){
            System.out.println("The List is Empty.");
            return;
        }
        while(current != null){
            System.out.print(current.n + " ");
            current = current.next;
        }
        System.out.println();

    }

    //Method that gets the last node of a singly linked list.
    @Override
    public int getLast() {
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        return current.n;
    }

    //Method that gets the size of a singly linked list. Used for testing.
    @Override
    public int size() {
        int size = 0;
        for(Node n = head; n.next != null; n=n.next){
            size++;
        }
        return size;
    }

    //Method that adds the elements of a singly linked list together and returns the total.
    public int addTogether(){
        int sum = 0;
        Node current = head;
        while(current != null){
            sum += current.n;
            current = current.next;
        }
        return sum;
    }
}
