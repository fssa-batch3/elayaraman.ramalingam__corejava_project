package com.fssa.corejava.day04.practice;

public class RightAngledTriangle extends Rectangle{
	
	protected double height;
	protected double base;
	
	public RightAngledTriangle(int height, int base) throws Exception{
		super(3, base);
		if(length <=0 || base <= 0) {
			throw new Exception("Invalid dimensions for a right triangle");
		}
		this.height = height;
		this.base = base;
		
		@Override
		public int calculateArea() {
			return (1/2) * base * height ;
		}
		
		public int getNumberOfSides() {
			return super.numberOfSides;
		}
	}

}
