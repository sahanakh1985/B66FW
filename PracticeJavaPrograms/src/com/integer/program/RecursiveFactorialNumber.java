package com.integer.program;

public class RecursiveFactorialNumber {
	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}

	}

	public static void main(String[] args) {
		int n = 7;
		int result = factorial(n);
		System.out.println(result);
		// System.out.println(7 * 6 * 5 * 4 * 3 * 2 * 1);------factorial(7)

	}

}
