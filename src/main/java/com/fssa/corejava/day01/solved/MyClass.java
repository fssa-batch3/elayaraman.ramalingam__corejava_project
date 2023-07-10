package com.fssa.corejava.day01.solved;

public class MyClass {
    // Declare an instance variable
    public int instanceVariable;

    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass myObject = new MyClass();

        // Access the instance variable using the object reference
        myObject.instanceVariable = 5;
        System.out.println(myObject.instanceVariable);
    }
}