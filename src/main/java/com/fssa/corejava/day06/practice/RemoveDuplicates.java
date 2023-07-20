package com.fssa.corejava.day06.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Tasku> cityList = new ArrayList<>();
        cityList.add(new Tasku(1, "One", LocalDate.of(2023, 8, 7)));
        cityList.add(new Tasku(2, "Two", LocalDate.of(2023, 8, 7)));
        cityList.add(new Tasku(3, "Three", LocalDate.of(2023, 8, 7)));
        cityList.add(new Tasku(3, "Three", LocalDate.of(2023, 8, 7)));
        cityList.add(new Tasku(4, "Four", LocalDate.of(2023, 8, 7)));
        cityList.add(new Tasku(4, "Four", LocalDate.of(2023, 8, 7)));

        List<Tasku> newList = new ArrayList<>();
        Set<String> names = new HashSet<>();

        for (Tasku i : cityList) {
            if (!names.contains(i.getName())) {
                newList.add(i);
                names.add(i.getName());
            }
        }

        System.out.println(newList);
    }

}

class Tasku {
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

    public Tasku(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }
}
