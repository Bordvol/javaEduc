package com.study.datastructures.map;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        java.util.Map map = new HashMap();

        Object put = map.put("user", "Roo");
        System.out.println(put); // null

        System.out.println(map.get("user")); // Roo

        Object updated = map.put("user", "Rooman");
        System.out.println(updated); // Roo

        System.out.println(map.size()); // 1

        System.out.println(map.get("pass")); // null
        map.put("pass", "password");
        System.out.println(map.get("pass")); // password

        System.out.println(map.size()); // 2

        System.out.println(map.remove("pass")); // password
        System.out.println(map.size()); // 1
    }
}