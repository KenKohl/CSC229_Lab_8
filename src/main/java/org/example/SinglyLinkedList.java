package org.example;

/**
 * Interface for Singly Linked List
 *
 * Author: Ken Kohlhof
 * Assignment: Lab 8
 */
public interface SinglyLinkedList {
    public void addNode(int n);

    public int getNode(int n);

    //Used for testing
    public void getList();

    public int getLast();

    //Used for testing
    public int size();

}
