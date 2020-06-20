package com.packy.jdk8.newfeature.streams;

import com.packy.jdk8.newfeature.funcprogramming.Instructor;
import com.packy.jdk8.newfeature.funcprogramming.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result_1 = numbers.stream().reduce(0, (a, b) -> a + b);
        int result_2 = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(result_1);
        System.out.println(result_2);

        Optional<Integer> result_3 = numbers.stream().reduce((a, b) -> a + b);
        result_3.ifPresent(System.out::println);

        Optional<Instructor> instructor = Instructors.getAll().stream()
                .reduce((s1, s2) -> s1.getYearsOfExperience() > s2.getYearsOfExperience() ? s1 : s2);
        instructor.ifPresent(System.out::println);
    }
}
