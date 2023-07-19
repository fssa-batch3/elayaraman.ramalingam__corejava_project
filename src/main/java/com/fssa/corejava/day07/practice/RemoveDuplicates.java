package com.fssa.corejava.day07.practice;

import java.util.*;


public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		List<Integer> list_1 = new ArrayList<>();
		list_1.add(1);
		list_1.add(1);
		list_1.add(3);
		list_1.add(2);
		list_1.add(3);
		list_1.add(4);
		
		Set<Integer> list_2 = new HashSet<>(list_1);
		
		System.out.println(list_2);
		
	}

}
