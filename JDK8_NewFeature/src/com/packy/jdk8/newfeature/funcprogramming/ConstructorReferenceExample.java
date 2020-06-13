package com.packy.jdk8.newfeature.funcprogramming;

import java.util.Collections;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Tom", 22, "CEO", "F", false, Collections.singletonList("ForgeRock"));
        System.out.println(instructor);
    }
}
