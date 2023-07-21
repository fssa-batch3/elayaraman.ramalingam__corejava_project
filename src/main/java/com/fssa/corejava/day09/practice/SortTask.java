package com.fssa.corejava.day09.practice;

import java.util.*;
import java.time.*;

public class SortTask {

    static class Task {
        private int id;
        private String name;
        private LocalDate deadline;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getDeadline() {
            return deadline;
        }

        public void setDeadline(LocalDate deadline) {
            this.deadline = deadline;
        }

        public Task(int id, String name, String date) {
            this.id = id;
            this.name = name;
            LocalDate deadlineDate = LocalDate.parse(date);
            this.deadline = deadlineDate;
        }
    }

    static class DateSorter implements Comparator<Task> {
        
        @Override
        public int compare(Task task1, Task task2) {
            return task1.getDeadline().compareTo(task2.getDeadline());
        }

    }

    public static void main(String[] args) {
        List<Task> list = new ArrayList<>();

        list.add(new Task(2,"Coding","2022-10-22"));
        list.add(new Task(5,"Product Design","2022-10-01"));
        list.add(new Task(1,"Software Design", "2022-10-07"));
        list.add(new Task(3, "Coding", "2022-10-22"));
        
        Collections.sort(list, new DateSorter());

        for (Task task : list) {
            System.out.println("ID: " + task.id + ", Name: " + task.name + ", Deadline: " + task.deadline);
        }
    }
}
