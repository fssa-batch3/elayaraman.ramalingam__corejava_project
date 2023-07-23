package com.fssa.corejava.day10.practice;

public class User {

	int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	String name;
	String email;

	public User(int id,String name, String email) throws InvalidEmailException, UserAlreadyExistsException {
		this.id = id;
		this.name = name;
		setEmail(email);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws InvalidEmailException {
		if (email == null || email.isEmpty()) {
			throw new InvalidEmailException("Email cannot be empty da Jokkerr");
		}

		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

		if (!email.matches(emailRegex)) {
			throw new InvalidEmailException("Invalid email ra jokerrr");
		}

		this.email = email;
	}

}
