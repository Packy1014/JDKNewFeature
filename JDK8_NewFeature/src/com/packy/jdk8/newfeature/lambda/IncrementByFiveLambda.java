package com.packy.jdk8.newfeature.lambda;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface = num -> num + 5;

        System.out.println(incrementByFiveInterface.incrementByFive(20));
    }
}
