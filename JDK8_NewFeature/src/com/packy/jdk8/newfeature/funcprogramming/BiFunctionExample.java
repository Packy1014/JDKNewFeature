package com.packy.jdk8.newfeature.funcprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {
        final Predicate<Instructor> p = instructor -> instructor.getGender().equals("M");
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> mapBiFunction = (instructors, predicate) -> {
            final Map<String, Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                if (predicate.test(instructor)) {
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
                }
            });
            return map;
        };
        System.out.println(mapBiFunction.apply(Instructors.getAll(), p));
    }
}
