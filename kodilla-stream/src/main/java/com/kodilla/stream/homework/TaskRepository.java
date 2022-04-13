package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Shopping", LocalDate.of(2020,04,04), LocalDate.of(2022, 04, 14) ));
        tasks.add(new Task("Cleaning", LocalDate.of(2022,03,04), LocalDate.of(2022,05,01)));
        tasks.add(new Task("learning", LocalDate.of(2022,04,11), LocalDate.of(2022,04,12)));
        return tasks;

    }
}
