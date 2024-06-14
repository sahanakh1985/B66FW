package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter all the elements of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);

		}
		int newArr[] = new int[set.size()];
		int index = 0;

		for (int i : set) {
			newArr[index++] = i;

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));

	}

}
