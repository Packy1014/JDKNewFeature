package com.packy.jdk9.moduleb;

import com.packy.jdk9.modulea.User;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Packy", 32);
        System.out.println(user);
    }
}
