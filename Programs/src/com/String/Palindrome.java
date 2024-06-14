package com.String;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		String input = sc.nextLine();
		int num = input.length();
		int i = 0;
		int j = num - 1;

		while (i <= j) {
			if (input.charAt(i) == input.charAt(j)) {
				i++;
				j--;
			} else {
				break;
			}

		}
		if (i > j) {
			System.out.println("The given input is palindrome");
		} else {
			System.out.println("The given input is  not palindrome");
		}
	}

}
