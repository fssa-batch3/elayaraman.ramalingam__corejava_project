package com.fssa.corejava.day10.practice;



import java.util.*;

public class UserServices {
	
	private List<User> users= new ArrayList<>();
	
	public void addUser(int id,String name,String email) throws InvalidEmailException, UserAlreadyExistsException {
		for(User user : users) {
			if(user.getEmail().equals(email)) {
				throw new UserAlreadyExistsException("User Already exception");
			}
		}
		
		User user = new User(id,name, email);
		users.add(user);
	}

}
