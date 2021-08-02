package com.company;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 01.08.2021.
 * Time: 14:28.
 */
public class MySingleLinkedList<T> {

    private int size = 0;
    private Node head;

    public MySingleLinkedList() {
    }


    private static class Node<T> {
        private T data;
        private Node next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public boolean add(T data) {
        insert(data);
        return true;
    }


    private void insert(T data) {

        Node<T> newNode = new Node<>(data, head);
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node<T> last = head;
            while (head.next != null) {
                head = head.next;
            }
            head.next = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return node(index).data;
    }

    private Node<T> node(int index) {

        Node<T> x = head;

        for (int i = 0; i < index; i++)
            x = x.next;
        return x;

    }

    @Override
    public String toString() {
        return  "MySingleLinkedList{" +
                "head= " + head.data +
                '}';
    }
}