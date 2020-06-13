package com.packy.jdk8.newfeature.funcprogramming;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Long> self = UnaryOperator.identity();
        System.out.println(self.apply(10L));

        UnaryOperator<Integer> unaryOperator = i -> i * 10;
        System.out.println(unaryOperator.apply(10));

        IntUnaryOperator intUnaryOperator = i -> i * 10;
        System.out.println(intUnaryOperator.applyAsInt(10));
    }
}
