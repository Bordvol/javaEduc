package com.study.datastructures.queue;

import java.util.NoSuchElementException;

public class LinkedQueue implements Queue {
    int size;
    Node tail;
    Node head;

    @Override
    public void enqueue(Object value) {
        Node newNode = new Node(value);
        Node oldNode = tail;
        if (size == 0) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail = newNode;
            oldNode.next = tail;
        }
        size++;
    }

    @Override
    public Object dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        Node oldNode = new Node(head);
        head = head.next;
        size--;
        return oldNode;
    }

    @Override
    public Object peek() {
        return tail.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(Object value) {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        boolean result = false;
        Node currentNode = head;
        Node previousNode = head;
        int tempSize = size;

        for(int i = 0; i < tempSize; i++) {
            if (currentNode.value.equals(value))
            {
                if (i == 0) {
                    head = head.next;
                } else if (i == tempSize){
                    head = previousNode;
                    previousNode.next = null;
                }
                else {
                    previousNode.next = currentNode.next;
                }
                size--;
                result = true;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return result;
    }

    @Override
    public boolean contains(Object value) {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        boolean result = false;
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            if (currentNode.value.equals(value)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            result = i==0?((String)currentNode.value):result + ", " + currentNode.value;
            currentNode = currentNode.next;
        }
        return result;
    }

    public Object getHead() {
        return head.value;
    }
}
