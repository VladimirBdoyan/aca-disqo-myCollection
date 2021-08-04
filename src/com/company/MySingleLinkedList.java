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
            Node<T> last = newNode;
            last.next = head;
            head = last;
        }
        size++;
    }

    public void remove(int index) {
        int head = index - 1;
        int last = index + 1;
        node(last).next = node(head);
        size--;
    }
    public int size() {
        return size;
    }

    public T get(int index) {
        return node(index).data;
    }

    public boolean contains (T t){
        return indexOf(t) >= 0;
    }

    public int indexOf(T t){
        int index = 0;
        for(Node<T> x = head; x!=null; x = x.next){
            if(t.equals(x.data)){
                return index;
            }
            index++;
        }
        return -1;
  }

    // Iterate nodes for get index
    private Node<T> node(int index) {

        Node<T> x = head;
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = size - 1; i > index; i--)
                x = x.next;
        }
        return x;
    }
}