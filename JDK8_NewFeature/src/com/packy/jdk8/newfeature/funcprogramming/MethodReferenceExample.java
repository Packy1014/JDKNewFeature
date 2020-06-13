package com.packy.jdk8.newfeature.funcprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> predicate1 = instructor -> instructor.isOnlineCourses();
        Predicate<Instructor> predicate2 = Instructor::isOnlineCourses;

        Function<Integer, Double> sqrt1 = integer -> Math.sqrt(integer);
        Function<Integer, Double> sqrt2 = Math::sqrt;

        Function<String, String> lowercase1 = string -> string.toLowerCase();
        Function<String, String> lowercase2 = String::toLowerCase;
    }
}
