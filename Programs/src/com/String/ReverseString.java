package com.String;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String input = sc.nextLine();
		String[] words = input.split(" ");
		System.out.println(words.length);
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");

		}
	}

}
