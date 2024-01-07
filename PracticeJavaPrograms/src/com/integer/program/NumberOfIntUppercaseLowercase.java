package com.integer.program;

import java.util.Scanner;

public class NumberOfIntUppercaseLowercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = sc.nextLine();
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				upperCaseCount++;

			} else if (Character.isLowerCase(input.charAt(i))) {
				lowerCaseCount++;
			} else if (Character.isDigit(input.charAt(i))) {
				digitCount++;

			}

		}
		System.out.println("uppercase count:" + upperCaseCount);
		System.out.println("lowercase count:" + lowerCaseCount);
		System.out.println("Digit count:" + digitCount);
	}

}
