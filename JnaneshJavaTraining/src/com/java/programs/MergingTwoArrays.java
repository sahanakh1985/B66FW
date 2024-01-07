package com.java.programs;

import java.util.Arrays;

public class MergingTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8 };
		int[] result = new int[arr1.length + arr2.length];
		for (int i = 0, j = 0; i < result.length; i++) {
			if (i < arr1.length) {
				result[i] = arr1[i];
			} else {
				result[i] = arr2[j];
				j++;
			}

		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(result));

	}
}
