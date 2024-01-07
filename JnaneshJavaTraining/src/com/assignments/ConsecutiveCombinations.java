package com.assignments;

import java.util.Scanner;

public class ConsecutiveCombinations {
	public static void main(String[] args) {
		// Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive natural number N: ");
		int N = scanner.nextInt();

		// Output
		System.out.printf("Output for N = %d:%n", N);
		findConsecutiveCombinations(N);
	}

	static void findConsecutiveCombinations(int N) {
		for (int i = 1; i < N; i++) {
			int sumOfNumbers = i;
			int j = i + 1;

			while (sumOfNumbers < N) {
				sumOfNumbers += j;
				j++;
			}

			if (sumOfNumbers == N) {
				printConsecutiveNumbers(i, j);
			}
		}
	}

	static void printConsecutiveNumbers(int start, int end) {
		for (int k = start; k < end; k++) {
			System.out.print(k);
			if (k < end - 1) {
				System.out.print(" + ");
			}
		}
		System.out.println();
	}
}
