package com.string.programs;

import java.util.Scanner;

public class CustomReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input = sc.nextLine();
		int num = input.length();
		String rev = " ";
		for (int i = num - 1; i >= 0; i--) {
			char temp = input.charAt(i);
			rev = rev + temp;

		}
		System.out.println("the reverse string is:" + rev);
	}

}
