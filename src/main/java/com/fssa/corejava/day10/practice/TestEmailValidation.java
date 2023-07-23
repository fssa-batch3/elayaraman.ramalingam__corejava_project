package com.fssa.corejava.day10.practice;

import java.util.*;

public class TestEmailValidation {
	
	public static void main(String[] Args) throws InvalidEmailException, UserAlreadyExistsException{
		
		UserServices list = new UserServices();
		list.addUser(1, "email@gmail", "email@gmail.com");
		list.addUser(2, "email@gmail", "email2@gmail.com");
	}
}
