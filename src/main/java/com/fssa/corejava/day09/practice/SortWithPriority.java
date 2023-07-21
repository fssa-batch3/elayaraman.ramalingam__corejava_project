package com.fssa.corejava.day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithPriority {
     static class Task {
        private int id;
        private String name;
        private LocalDate deadline;
        private int priority;

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

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

        public Task(int id, String name, String date,int priority) {
            this.id = id;
            this.name = name;
            LocalDate deadlineDate = LocalDate.parse(date);
            this.deadline = deadlineDate;
            this.priority = priority;
        }
    }

    static class DateSorter implements Comparator<Task> {
        
        @Override
        public int compare(Task task1, Task task2) {
            int num = task1.getDeadline().compareTo(task2.getDeadline());
            if (num == 0) {
                return Integer.compare(task1.getPriority(), task2.getPriority());
            }
            return num;
        }



    }

    public static void main(String[] args) {
        List<Task> list = new ArrayList<>();

        list.add(new Task(1, "One", "2023-08-07", 2));
        list.add(new Task(2, "Two", "2023-09-07", 1));
        list.add(new Task(3, "Three", "2023-09-07", 3));
        list.add(new Task(4, "Four", "2023-10-07", 1));
        
        Collections.sort(list, new DateSorter());

        for (Task task : list) {
            System.out.println("ID: " + task.id + ", Name: " + task.name + ", Deadline: " + task.deadline + ", Priority: " + task.priority);
        }
    }
}
