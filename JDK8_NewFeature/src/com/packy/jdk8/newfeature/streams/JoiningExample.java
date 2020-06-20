package com.packy.jdk8.newfeature.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        String result_1 = Stream.of("E", "F", "G", "H").collect(Collectors.joining());
        System.out.println(result_1);

        String result_2 = Stream.of("E", "F", "G", "H").collect(Collectors.joining("|"));
        System.out.println(result_2);

        String result_3 = Stream.of("E", "F", "G", "H").collect(Collectors.joining("|", "{", "}"));
        System.out.println(result_3);
    }
}
