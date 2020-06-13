package com.packy.jdk8.newfeature.funcprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(64));

        Function<String, String> lowercaseFunction = String::toLowerCase;
        Function<String, String> concatFunction = s -> s.concat(" In Java");
        System.out.println(lowercaseFunction.andThen(concatFunction).apply("Programming"));
        System.out.println(lowercaseFunction.compose(concatFunction).apply("Programming"));

        final Predicate<Instructor> p = instructor -> instructor.getGender().equals("M");
        Function<List<Instructor>, Map<String, Integer>> mapFunction = instructors -> {
            final Map<String, Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                if (p.test(instructor)) {
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
                }
            });
            return map;
        };
        System.out.println(mapFunction.apply(Instructors.getAll()));
    }
}
