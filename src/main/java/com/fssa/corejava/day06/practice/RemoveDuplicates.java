package com.fssa.corejava.day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	
	private static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		List<String> newList = new ArrayList<>();
		for(String i : cityList) {
			if(!newList.contains(i)) {
				newList.add(i);
			}
		}
		System.out.println(newList);
		
	}

}
