package com.my.learn;

public class Factorial {

	// The number you want to see factorial for
	private static int fact = 1;

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}

	private static int factorial(int value) {
		for (int i = 1; i <= value; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
