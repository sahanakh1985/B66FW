package array.programs;

import java.util.Iterator;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 43, 6, 78, 31, 9, 94, 56 };
		int min;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}

			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
