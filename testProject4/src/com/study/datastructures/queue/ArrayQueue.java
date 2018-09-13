package com.study.datastructures.queue;

import java.util.NoSuchElementException;
//import com.study.datastructures.stack.Queue;

public class ArrayQueue implements Queue {
    Object[] array;
    int size;

    public ArrayQueue() {
        int initialCapacity = 5;
        array = new Object[initialCapacity];
    }

    @Override
    public void enqueue(Object value) {
            if (size == array.length) {
                Object[] newArray = new Object[(int) (size * 2)];
                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }
                array = newArray;
            }
            array[size] = value;
            size++;
    }

    @Override
    public Object dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        Object result = array[0];
        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i+1];
        }
        array = newArray;
        return result;
    }

    @Override
    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        return array[size - 1];
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
        int valueFoundCount = 0;
        for (int i = 0; i < size; i++) {
            if ( array[i] != null && array[i].equals(value)) {
                valueFoundCount++;
            }
        }
        if (valueFoundCount > 0){
            Object[] newArray = new Object[size - valueFoundCount];
            for (int i = 0; i < valueFoundCount; i++) {
                if (!array[i].equals(value)) {
                    newArray[i] = array[i];
                }
            }
            array = newArray;
        }
        size = size - valueFoundCount;
        return (valueFoundCount > 0);
    }

    @Override
    public boolean contains(Object value) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(value)) {
                result = true;
                break;
            }
        }
        return result;
    }
}