package com.fssa.corejava.day04.practice;

import com.fssa.corejava.day04.solved.Polygon;

public class Rectangle extends Polygon {
	
	protected double length;
	protected double breadth;
	
	public Rectangle(int length, int breadth) throws Exception {
		super(4);
		if(length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.length * this.breadth;
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}