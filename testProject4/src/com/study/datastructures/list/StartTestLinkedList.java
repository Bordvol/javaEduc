package com.study.datastructures.list;

import com.study.datastructures.list.LinkedList;
//import java.util.NoSuchElementException;
//import com.study.datastructures.queue.LinkedStack;
//import com.study.datastructures.stack.ArrayStack;
//import com.study.datastructures.stack.Stack;

public class StartTestLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());

        linkedList.add("A");
        System.out.println(linkedList.size());
     //   System.out.println(linkedList.toString());
        System.out.println();

        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());
        System.out.println();

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(4));
        System.out.println();

        linkedList.remove(2);
        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());
        System.out.println();

        System.out.println(linkedList.get(3));
        System.out.println(linkedList.set("Y",3));
        System.out.println(linkedList.toString());
        System.out.println();

        /*
        arrayList.add("D");
        System.out.println(arrayList.size());
        arrayList.add("E");
        arrayList.add("E");
        arrayList.add("G");
        arrayList.add("H");
        arrayList.add("I");
        arrayList.add("J");
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());

        arrayList.add("K", 5);
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());
        System.out.println();

        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());
        System.out.println();

        System.out.println(arrayList.get(2));
        System.out.println();

        System.out.println(arrayList.set("M", 7));
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());
        System.out.println();

        System.out.println(arrayList.isEmpty());
        System.out.println();

        System.out.println("if M exists: " + arrayList.contains("M"));
        System.out.println("if Y exists: " + arrayList.contains("Y"));
        System.out.println();

        System.out.println(arrayList.indexOf("D"));
        System.out.println();

        System.out.println(arrayList.lastIndexOf("D"));
        System.out.println();

        arrayList.clear();
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());
        System.out.println(arrayList.isEmpty());
        */
    }
}
