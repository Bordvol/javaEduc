package com.study.datastructures.stack;

//import com.study.datastructures.stack.LinkedStack;

public class LinkedStack implements Stack {
    int size;
    Node tail;

    @Override
    public void push(Object value) {
        Node newNode = new Node(value);
        if (size != 0) {
            newNode.prev = tail;
        }

        tail = newNode;
        size++;

    }

    @Override
    public Object pop() {
        Object result = tail.value;
        tail = tail.prev;
        size--;
        return result;
    }

    @Override
    public Object peek() {
        Object result = tail.value;
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(Object value) {
        return false;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }
}