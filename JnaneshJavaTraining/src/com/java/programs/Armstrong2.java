package com.java.programs;

import java.util.Scanner;

public class Armstrong2 {
	public static int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;

	}

	public static int pow(int m, int n) {
		int res = 1;
		for (int i = 0; i < n; i++) {
			res = res * m;

		}
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the  n value");
		int n = sc.nextInt();

		int temp = n;
		int sumOfTheDigits = 0;
		int count = countDigit(n);
		while (n > 0) {
			int last = n % 10;
			sumOfTheDigits = sumOfTheDigits + pow(last, count);
			n = n / 10;

		}
		System.out.println((temp == sumOfTheDigits) ? "the number is an Armstrong" : "the number is  not an Armstrong");

	}
}
