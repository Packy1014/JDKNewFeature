package com.packy.jdk8.newfeature.funcprogramming;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> Double.valueOf(Math.random() * 1000).intValue();
        System.out.println(supplier.get());
    }
}
