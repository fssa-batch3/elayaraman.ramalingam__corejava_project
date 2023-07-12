package com.fssa.corejava.day03.misc;

import java.time.LocalDateTime;

public class Logger {
	
	public static void Info(String m) {
		System.out.println(m);
	}
	public static void Debugger(String m) {
		LocalDateTime t = LocalDateTime.now();
		System.out.println((t.toString()).concat(m));
	}

}
