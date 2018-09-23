package com.study.datastructures.list;

public class LinkedList implements List {
    private Node head;
    private Node tail;
    private int size;

    private void validateIndex(int index) {
        if ((index < 0) || (index > size - 1)) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    //ToDo - 2 бежать с двухсторон,
    public void add(Object value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    //ToDo with moving prev element - before A, B, add C, 1 -> A, C, B. ToDo - 2 бежать с двухсторон,
    public void add(Object value, int index) {
        validateIndex(index);
        
        Node tempNode = head;
        for (int i = 0; i <= index; i++) {
            tempNode = tempNode.next;
        }
        tempNode.value = value;
    }

    @Override
    public Object remove(int index) {
        validateIndex(index);

        if (index == 0) {
            Node result = new Node(head.value);
            head.next.prev = null;
            head = head.next;
            size--;
            return result;
        }
        if (index == size - 1) {
            Node result = new Node(tail.value);
            tail.prev.next = null;
            tail = tail.prev;
            size--;
            return result;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        for (int i = 1; i <= index; i++) {
            if (i == index) {
                Node result = new Node(prevNode.next.value);
                prevNode.next = currentNode.next;
                size--;
                return result;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    @Override
    public Object get(int index) {
        validateIndex(index);

        Node result = head;
        if (index == 0) {
            return head.value;
        } else if (index == size - 1) {
            return tail.value;
        } else {
            for (int i = 0; i < index; i++) {
                result = result.next;
            }
        }
        return result.value;
    }

    @Override
    public Object set(Object value, int index) {
        validateIndex(index);

        Node tempNode = head;
        for (int i = 1; i <= index; i++) {
            tempNode = tempNode.next;
        }
        Node result = new Node(tempNode.value);
        tempNode.value = value;
        return result.value;
    }

    @Override
    public void clear() {
//УБРАТЬ ТОЛЬКО ХЄД И ТЕЙЛ
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) != -1;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }

    @Override
    public String toString() {
        String result = "";
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.value.equals(null) == false) {
                result = i == 0 ? (String) tempNode.value : result + ", " + tempNode.value;
                tempNode = tempNode.next;
            }
        }
        return result;
    }
}