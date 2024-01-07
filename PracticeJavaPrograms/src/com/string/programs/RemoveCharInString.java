package com.string.programs;

import java.util.Scanner;

public class RemoveCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		System.out.println("Enter the character");
		String ch = sc.next();

		
			if (input.contains(ch)) {
				String newStr = input.replace(ch, " ");
				System.out.println(newStr);
			} else {
				System.out.println(ch + " is not found");
			}

		}

	}


