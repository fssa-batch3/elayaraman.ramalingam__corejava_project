package com.fssa.corejava.day10.practice;

import java.util.*;

public class TestEmailValidation {
	
	public static void main(String[] Args) throws InvalidEmailException{
		
		List<User> users= new ArrayList<>();
		
		try {
			users.add(new User(1,"name","email"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
