package com.packy.jdk8.newfeature.funcprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = Integer::sum;
        System.out.println(binaryOperator.apply(1, 2));

        Comparator<Integer> comparator = Integer::compareTo;
        BinaryOperator<Integer> maxBinaryOperator = BinaryOperator.maxBy(comparator);
        System.out.println(maxBinaryOperator.apply(11, 22));

        DoubleBinaryOperator doubleBinaryOperator = Double::max;
        System.out.println(doubleBinaryOperator.applyAsDouble(10, 50));
    }
}
