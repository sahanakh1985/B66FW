package com.java.programs;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean checkPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + " is " + (checkPrime(i) ? "a prime number" : " not a prime number"));

		}

	}

}
