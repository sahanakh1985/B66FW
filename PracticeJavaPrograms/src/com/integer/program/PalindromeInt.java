package com.integer.program;

import java.util.Scanner;

public class PalindromeInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int temp = num;
		int sumOfTheDigits = 0;

		while (num > 0) {
			int last = num % 10;
			sumOfTheDigits = sumOfTheDigits * 10 + last;
			num = num / 10;

		}
		System.out.println(
				temp == sumOfTheDigits ? "the given number  is palindrome" : "The given number is not a palindrome");
	}

}
