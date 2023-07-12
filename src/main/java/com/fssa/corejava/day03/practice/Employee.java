package com.fssa.corejava.day03.practice;

public class Employee {
	 
    private int id;
    private String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String ToString() {
    String str = "id="+id+", name="+name;
    return str;
    }
}