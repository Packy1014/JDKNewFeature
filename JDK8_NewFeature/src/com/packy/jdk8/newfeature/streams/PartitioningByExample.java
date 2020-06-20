package com.packy.jdk8.newfeature.streams;

import com.packy.jdk8.newfeature.funcprogramming.Instructor;
import com.packy.jdk8.newfeature.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        Predicate<Instructor> experiencePredicate = instructor -> instructor.getYearsOfExperience() > 10;
        Map<Boolean, List<Instructor>> partitionMap = Instructors.getAll().stream()
                .collect(Collectors.partitioningBy(experiencePredicate));
        partitionMap.forEach((key, value) -> {
            System.out.println(key + " | " + value);
        });
    }
}
