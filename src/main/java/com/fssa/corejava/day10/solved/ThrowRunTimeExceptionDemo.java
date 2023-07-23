package com.fssa.corejava.day10.solved;

class NewTaskValidator {
    public static boolean validate(Task task) {
        try {
            if (task == null)
                throw new IllegalArgumentException("Task is null");
            else if (task.getName() == null || "".equals(task.getName()))
                throw new IllegalArgumentException("Task name is empty");

            System.out.println("Good to go!");
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}

class Task {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // empty constructor
    public Task() {
    }

    public Task(String name) {
        this.name = name;
    }
}

public class ThrowRunTimeExceptionDemo {
    public static void main(String[] args) {
        Task task = new Task();
        //task.setName("SUmmakjnvkj v");
        NewTaskValidator.validate(task);
    }
}
