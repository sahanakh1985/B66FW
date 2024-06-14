package com.array;

import java.util.Arrays;

public class InsertElementInArray {
	public static void main(String[] args) {
		int[] arr = { 2, 45, 17, 66, 23, 89 };
		int element = 50;
		int index = 4;
		int[] res = new int[arr.length + 1];

		for (int i = 0, j = 0; i < res.length; i++) {
			if (i == index) {
				res[i] = element;
			} else {
				res[i] = arr[j];
				j++;
			}

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));

	}
}
