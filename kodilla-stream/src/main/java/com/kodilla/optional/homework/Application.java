package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Marek Marek", new Teacher("Tomasz Tomasz")));
        students.add(new Student("Arek Arek", new Teacher(null)));

        Teacher teacher = new Teacher("name1");

        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
    }
}
