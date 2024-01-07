package com.java.programs;

import java.util.Scanner;

public class SpecialNumber {
	public static int fact(int num) {
		int res = 1;
		for (int i = num; i >= 2; i--) {
			res = res * i;

		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value");
		int n = sc.nextInt();
		int temp = n;
		int sumOfTheDigits = 0;
		while (n > 0) {
			int last = n % 10;
			sumOfTheDigits = sumOfTheDigits + fact(last);
			n = n / 10;

		}
		System.out.println(temp == sumOfTheDigits ? "It is a special number" : "it is not a special number");
	}

}
