package com.study.datastructures.map;

public class StartTestHashMap {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        System.out.println("size is "+hashMap.size());
        System.out.println("length is "+hashMap.length());
        hashMap.put("A", 1);
        System.out.println("size is "+hashMap.size());
        System.out.println("length is "+hashMap.length());
        hashMap.put("B", 10);
        System.out.println("size is "+hashMap.size());
        System.out.println("length is "+hashMap.length());
        hashMap.put("C", 300);
        System.out.println("size is "+hashMap.size());
        System.out.println("length is "+hashMap.length());
        hashMap.put("D", 1000);
        System.out.println("size is "+hashMap.size());
        System.out.println("length is "+hashMap.length());
        hashMap.put("E", 3000);
        System.out.println("size is "+hashMap.size());
        System.out.println("length is "+hashMap.length());

        System.out.println(((Entry)hashMap.get("A")).value);
        System.out.println(((Entry)hashMap.get("B")).value);
        System.out.println(((Entry)hashMap.get("C")).value);
        System.out.println(((Entry)hashMap.get("D")).value);
        System.out.println(((Entry)hashMap.get("E")).value);

        System.out.println(hashMap.containsKey("R"));
        System.out.println(hashMap.containsKey("B"));
        hashMap.remove("B");
        System.out.println(hashMap.containsKey("B"));
        System.out.println(((Entry)hashMap.get("B")).value);

    }
}