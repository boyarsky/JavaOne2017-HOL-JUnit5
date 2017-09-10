package com.javaone.hol2017.junit5;

import java.util.*;

public class CableCars {

	private static final List<String> LINES = Arrays.asList("Powell-Hyde", "Powell-Mason", "California");
	
	public static int getNumberLines() {
		return LINES.size();
	}
	
	public static boolean isLine(String name) {
		return LINES.contains(name);
	}
	
}
