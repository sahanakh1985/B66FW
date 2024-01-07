package com.string.programs;

import java.util.Scanner;

public class ConvertStrIntoInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();

		try {
			int num = Integer.parseInt(input);
			System.out.println("Converted integer: " + num);
		} catch (NumberFormatException e) {
			System.out.println("Please enter a valid integer input.");
		}
	}
}