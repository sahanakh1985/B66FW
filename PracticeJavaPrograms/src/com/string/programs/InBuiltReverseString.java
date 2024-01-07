package com.string.programs;

public class InBuiltReverseString {
	public static void main(String[] args) {
		String input = "malayalam";
		String temp = input;
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		String rev = sb.toString();

		System.out.println(rev);
		System.out.println((temp.equals(rev)) ? "the string is palindrome" : "the string is not a palindrome");

	}

}
