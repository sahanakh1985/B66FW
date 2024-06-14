package com.array;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsIn2Arrays {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 44 };
		int[] arr2 = { 5, 2, 9, 44 };
		Set<Integer> commonNum = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					commonNum.add(arr1[i]);
				}

			}

		}
		System.out.println(commonNum);
		System.out.println(commonNum.size());

	}

}
