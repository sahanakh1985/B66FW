package com.string.programs;

import java.util.Scanner;

public class DuplicateCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input = sc.nextLine();

		int[] occured = new int[128];
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				occured[input.charAt(i)]++;
			}
		}
		for (int j = 0; j < occured.length; j++) {
			if (occured[j] > 1) {
				System.out.println((char) (j) + " is duplicate");

			}

		}

	}

}
