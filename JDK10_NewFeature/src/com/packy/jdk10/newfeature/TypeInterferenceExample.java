package com.packy.jdk10.newfeature;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;

public class TypeInterferenceExample {
    public static void main(String[] args) {
        var name = "Mike";
        printString(name);

        var dataTime = LocalDateTime.now();
        System.out.println(dataTime);

        var map = new HashMap<Integer, String>();
        map.put(1, "Jack");
        System.out.println(map);

        var numbers = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
    }

    public static void printString(String str) {
        System.out.println(str);
    }
}
