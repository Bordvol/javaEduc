package com.study.datastructures.queue;

import com.study.datastructures.queue.*;
//import java.util.NoSuchElementException;
//import com.study.datastructures.queue.LinkedStack;
//import com.study.datastructures.stack.ArrayStack;
//import com.study.datastructures.stack.Stack;

public class StartTestLinkedQueue {

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("B");
        queue.enqueue("D");

        System.out.println(queue.size());
        System.out.println(queue.toString());
        System.out.println();

        System.out.println(queue.contains("D"));
        System.out.println(queue.contains("E"));
        System.out.println();

        queue.dequeue();
        System.out.println(queue.size());
        System.out.println(queue.toString());
        System.out.println();

        queue.remove("B");
        System.out.println(queue.size());
        System.out.println(queue.toString());
        System.out.println();

        queue.enqueue("E");
        System.out.println(queue.size());
        System.out.println(queue.toString());
        System.out.println();

        System.out.println(queue.peek());
        System.out.println(queue.getHead());
        System.out.println();
    }
}
