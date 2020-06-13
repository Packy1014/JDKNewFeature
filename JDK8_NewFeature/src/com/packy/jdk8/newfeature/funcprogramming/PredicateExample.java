package com.packy.jdk8.newfeature.funcprogramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (i) -> i > 10;
        System.out.println(p1.test(2));
        Predicate<Integer> p2 = (i) -> i % 2 == 0;
        System.out.println(p1.and(p2).test(13));
    }
}
