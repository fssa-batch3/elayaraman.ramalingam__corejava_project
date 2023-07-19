package com.fssa.corejava.day07.practice;

import java.util.*;


public class Task {
	
	public static void main(String[] args) {
		
		List<String> list_1 = new ArrayList<>();
		list_1.add("one");
		list_1.add("one");
		list_1.add("two");
		list_1.add("three");
		list_1.add("three");
		list_1.add("four");
		
		Set<String> list_2 = new HashSet<>(list_1);
		
		System.out.println(list_2);
		
	}

}
