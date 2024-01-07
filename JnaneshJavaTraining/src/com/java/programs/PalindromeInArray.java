package com.java.programs;

import java.util.Scanner;

public class PalindromeInArray {
	public static int isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		int flag = 0;
		while (num > 0) {
			int last = num % 10;

			rev = rev * 10 + last;
			num = num / 10;

		}
		if (rev == temp) {
			flag = 1;

			// System.out.println("the given array is a palindrome");
		} else {
			flag = 0;
			// System.out.println("the given array is not palindrome");
		}
		return flag;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			flag = isPalindrome(arr[i]);
		}
		// if (flag =1) {
		System.out.println("the given array is palindrome");

		// } else {
		System.out.println("the given array is not a palindrome");

	}

}
