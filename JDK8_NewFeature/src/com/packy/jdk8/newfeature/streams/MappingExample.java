package com.packy.jdk8.newfeature.streams;

import com.packy.jdk8.newfeature.funcprogramming.Instructor;
import com.packy.jdk8.newfeature.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {
        List<String> nameList = Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
        nameList.forEach(System.out::println);

        Map<Integer, List<String>> yearsOfExperienceAndNameMap = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));
        System.out.println(yearsOfExperienceAndNameMap);
    }
}
