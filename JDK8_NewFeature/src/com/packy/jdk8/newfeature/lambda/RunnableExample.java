package com.packy.jdk8.newfeature.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++)
                sum += i;
            System.out.println(sum);
        };
        new Thread(runnable).start();

        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++)
                sum += i;
            System.out.println(sum);
        }).start();
    }
}
