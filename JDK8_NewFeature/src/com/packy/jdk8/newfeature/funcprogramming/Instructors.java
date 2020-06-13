package com.packy.jdk8.newfeature.funcprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll() {
        Instructor instructor_1 = new Instructor("Mike", 10, "Software Developer", "M", true, Arrays.asList("Java", "C"));
        Instructor instructor_2 = new Instructor("Jenny", 5, "Software Engineer", "F", false, Arrays.asList("Python", "Go"));
        Instructor instructor_3 = new Instructor("Jack", 15, "Manager", "M", false, Arrays.asList("Kong", "K8S"));
        List<Instructor> list = Arrays.asList(instructor_1, instructor_2, instructor_3);
        return list;
    }
}
