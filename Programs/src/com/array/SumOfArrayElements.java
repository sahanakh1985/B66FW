package com.array;

import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of array elements");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter all the elements of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;

		for (int i : arr) {
			sum = sum + i;

		}
		System.out.println("the sum of all the array elements :" + sum);

	}

}
