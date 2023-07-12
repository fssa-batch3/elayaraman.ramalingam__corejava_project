package com.fssa.corejava.day02.solved;

//Method overloading in Java
 class Calculator {
		// Calculating Area for Circle
 public double Calculator(double radius) {
     return Math.PI * radius * radius;
 }
		
		// Calculating Area for Rectangle
 public double Calculator(double length, double width) {
     return length * width;
 }
}

public class ShapeCalculator {
 public static void main(String[] args) {
	 Calculator calculator = new Calculator();
     double circleArea = calculator.Calculator(3.5);                     // Output: 38.48451000647496
     double rectangleArea = calculator.Calculator(4.2, 6.8);            // Output: 28.559999999999995
 }
}