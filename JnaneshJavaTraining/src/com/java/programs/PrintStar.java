package com.java.programs;

import java.util.Scanner;

public class PrintStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("*");

		}

	}

}
