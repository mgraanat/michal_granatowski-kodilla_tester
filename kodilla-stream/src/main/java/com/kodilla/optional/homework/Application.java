package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Marek Marek", new Teacher("Tomasz Tomasz")));
        students.add(new Student("Arek Arek", null));

        for (Student student : students) {
            Teacher teacher = student.getTeacher();

            Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
            Teacher teacher2 = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("Uczeń: " + student.getName() + " " + "Nauczyciel: " + teacher2.getName());
        }
    }
}
