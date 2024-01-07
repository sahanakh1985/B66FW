package com.java.programs;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int temp = 0;
		int min;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			temp = arr[i];
			arr[i] = min;
			min = temp;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}

	}

}
