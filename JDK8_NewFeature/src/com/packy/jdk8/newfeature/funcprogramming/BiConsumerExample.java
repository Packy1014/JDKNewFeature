package com.packy.jdk8.newfeature.funcprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x + y);
        biConsumer.accept(1, 2);
    }
}
