package com.fssa.corejava.day03.practice;

public class User {
	
	String name;
	String passwd;
	String email;
	public User(String e,String p) {
		passwd = p;
		email = e;
	}
	public User(String n,String e,String p) {
		name = n;
		passwd = p;
		email = e;
	}

}
