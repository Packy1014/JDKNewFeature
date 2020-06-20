package com.packy.jdk8.newfeature.streams;

import com.packy.jdk8.newfeature.funcprogramming.Instructor;
import com.packy.jdk8.newfeature.funcprogramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        Set<String> instructorsCourses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
        System.out.println(instructorsCourses);
    }
}
