package com.packy.jdk8.newfeature.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> System.out.println(str.length());
        consumer.accept("test");

        List<Instructor> instructors = Instructors.getAll();
        Consumer<Instructor> printConsumer = System.out::println;
        instructors.forEach(System.out::println);
        instructors.forEach(instructor -> System.out.println(instructor.getName()));
        instructors.forEach(instructor -> {
            if (instructor.yearsOfExperience > 10) {
                printConsumer.accept(instructor);
            }
        });
    }
}
