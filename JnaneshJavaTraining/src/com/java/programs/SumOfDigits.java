package com.java.programs;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			int last = n % 10;
			sum = sum + last;
			n = n / 10;
		}
		System.out.println(sum);
	}

}
