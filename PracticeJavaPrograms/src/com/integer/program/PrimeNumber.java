package com.integer.program;

public class PrimeNumber {
	public static boolean checkPrime(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// int n=8;
		for (int i = 1; i < 100; i++) {
			System.out.println(i + " is " + (checkPrime(i) ? " a prime number" : " not a prime number"));

		}

	}

}
