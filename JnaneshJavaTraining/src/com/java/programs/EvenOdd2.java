package com.java.programs;

import java.util.Scanner;

public class EvenOdd2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		String[] names = { "even", "odd" };
		System.out.println(names[n % 2]);
	}

}
