package com.packy.jdk11.newfeature;

import com.packy.jdk8.newfeature.funcprogramming.Instructor;
import com.packy.jdk8.newfeature.funcprogramming.Instructors;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class VarWithLambdaExample {
    public static void main(String[] args) {
        var instructors = Instructors.getAll();
        Predicate<Instructor> p = (var s) -> s.getYearsOfExperience() > 10;
        instructors.forEach(instructor -> {
            if (p.test(instructor)) {
                var result = instructor.getName();
                System.out.println(result);
            }
        });

        BiFunction<Integer, Integer, Integer> sum = (var x, var y) -> x + y;
        System.out.println(sum.apply(2, 4));
    }
}
