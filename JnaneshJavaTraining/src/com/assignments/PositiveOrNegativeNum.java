package com.assignments;

import java.util.Scanner;

public class PositiveOrNegativeNum {
	//Positive 0r negative
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println(n + "is positive number");

		} else {
			System.out.println(n + "is negative number");

		}
	}

}
