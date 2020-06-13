package com.packy.jdk8.newfeature.funcprogramming;

import java.util.List;

@FunctionalInterface
public interface InstructorFactory {
    Instructor getInstructor(String name, int yearsOfExperience, String title, String gender, boolean onlineCourses, List<String> courses);
}
