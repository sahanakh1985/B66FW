package array.programs;

import java.util.Arrays;

public class InsertElementInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int element = 18;
		int index = 5;
		int[] newArr = new int[arr.length + 1];

		for (int i = 0, j = 0; i < newArr.length; i++) {
			if (i == index) {
				newArr[i] = element;

			} else {
				newArr[i] = arr[j];
				j++;

			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));

	}

}
