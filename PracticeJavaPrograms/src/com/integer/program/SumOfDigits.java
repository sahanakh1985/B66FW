package com.integer.program;

public class SumOfDigits {

	public static void main(String[] args) {

		int num = 23456;
		int sumOfDigits = 0;

		while (num > 0) {
			int last = num % 10;
			sumOfDigits = sumOfDigits + last;
			num = num / 10;
		}
		System.out.println("Sum of the digits in a given number :" +sumOfDigits);

	}

}
