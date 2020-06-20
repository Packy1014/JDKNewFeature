package com.packy.jdk8.newfeature.streams;

import com.packy.jdk8.newfeature.funcprogramming.Instructor;
import com.packy.jdk8.newfeature.funcprogramming.Instructors;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> names = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> result_1 = names.stream()
                .collect(Collectors.groupingBy(String::length));
        result_1.forEach((key, value) -> {
            System.out.println(key + " | " + value);
        });
        System.out.println("----------------");
        LinkedHashMap<Integer, List<String>> result_2 = names.stream()
                .collect(Collectors.groupingBy(
                        String::length, LinkedHashMap::new, Collectors.filtering(
                                s -> s.contains("n"), Collectors.toList())));
        result_2.forEach((key, value) -> {
            System.out.println(key + " | " + value);
        });
        System.out.println("----------------");
        Map<String, List<Instructor>> result_3 = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getGender));
        result_3.forEach((key, value) -> {
            System.out.println(key + " | " + value);
        });
        System.out.println("----------------");
        Map<String, List<Instructor>> result_4 = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(
                        instructor -> instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR"));
        result_4.forEach((key, value) -> {
            System.out.println(key + " | " + value);
        });
        System.out.println("----------------");
        Map<Boolean, Optional<Instructor>> result_5 = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.maxBy(
                                Comparator.comparing(Instructor::getYearsOfExperience))));
        result_5.forEach((key, value) -> {
            System.out.println(key + " | " + value);
        });
        System.out.println("----------------");
        Map<Boolean, Instructor> result_6 = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(
                                        Comparator.comparing(Instructor::getYearsOfExperience)), Optional::get)));
        result_6.forEach((key, value) -> {
            System.out.println(key + " | " + value);
        });
    }
}
