package com.study.datastructures.stack;

import com.study.datastructures.stack.Stack;

public class ArrayStack implements Stack {
    Object[] array;
    int size=0;

    public ArrayStack() {
        int initialCapacity = 5;
        array = new Object[initialCapacity];
    }

    @Override
    public void push(Object value) {
        // TODO: check if array is full, create new, and copy values from old one
        System.out.println("array.length "+ array.length);
        System.out.println("size "+ size);
        if (array.length > size ) {
            array[size] = value;
        } else {
            int newSize = size + 5;
            Object[] oldArray = new Object[newSize];
            array = new Object[newSize];
            for (int i = 0; i < oldArray.length; i++) {
              array[i] = oldArray[i];
            }
       }
        size++;
    }

    @Override
    public Object pop() {
        Object[] result = new Object[array.length - 1];
        for (int i = 0; i < size - 1; i++) {
            result[i] = array[i];
        }
        size--;
        return result;
    }

    @Override
    public Object peek() {
        return null;
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