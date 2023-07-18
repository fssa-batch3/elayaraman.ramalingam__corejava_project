package com.fssa.corejava.day06.practice;

import java.util.ArrayList;
import java.util.List;

public class Task {

    private String taskName;
    private int priority;

    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        Task task1 = new Task("Task 1", 2);
        Task task2 = new Task("Task 2", 1);

        taskList.add(task1);
        taskList.add(task2);

        boolean foundByName = findByName(taskList, "Task 1");
        System.out.println( foundByName);

        for (Task task : taskList) {
            System.out.println("Task Name: " + task.getTaskName());
            System.out.println("Priority: " + task.getPriority());
            System.out.println();
        }
    }

    public static boolean findByName(List<Task> taskList, String name) {
        for (Task task : taskList) {
            if (name.equals(task.getTaskName())) {
                return true;
            }
        }
        return false;
    }
}
