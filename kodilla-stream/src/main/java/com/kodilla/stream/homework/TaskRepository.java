package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Shopping", ));
        return tasks;

    }
}
