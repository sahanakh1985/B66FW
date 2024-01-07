package com.java.programs;

import java.util.Scanner;

public class StarPatternM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || (i == j & i <= n / 2) || (i + j == n - 1 & i <= n / 2) || j == n - 1)
					System.out.print("*");

				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
}
