package com.github.amirlatifi;

public class Main {

	private static String var;

	public static void main(String[] args) {
		System.out.println("Hello World!");

		testNegativeCondition(true);
	}

	private static void testNegativeCondition(boolean bool) {
		System.out.println("bool is: " + bool);
		if (!bool) {
			return;
		}
		var = "Sth";
	}
}
