package com.packy.jdk8.newfeature.streams;


import java.util.Random;
import java.util.stream.Stream;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Stream<Integer> stream_1 = Stream.iterate(0, i -> i + 2).limit(10);
        stream_1.forEach(System.out::println);

        Stream<Integer> stream_2 = Stream.generate(new Random()::nextInt).limit(10);
        stream_2.forEach(System.out::println);
    }
}
