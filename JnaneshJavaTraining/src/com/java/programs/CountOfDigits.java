package com.java.programs;

import java.util.Scanner;

public class CountOfDigits {
	public static int countDigits(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int count = countDigits(n);
		System.out.println("number of digits: "+count);

	}

}
