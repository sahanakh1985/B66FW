package com.array;

import java.util.Arrays;

public class MergingOfTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8 };
		int[] res = new int[arr1.length + arr2.length];

		for (int i = 0, j = 0; i < res.length; i++) {
			if (i < arr1.length) {
				res[i] = arr1[i];
			} else {
				res[i] = arr2[j];
				j++;
			}

		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(res));
	}

}
