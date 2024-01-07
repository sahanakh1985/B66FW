package array.programs;

import java.util.ArrayList;

public class CommonElementsInTwoArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 5, 67, 3, 42 };
		int[] arr2 = { 3, 7, 5, 67, 9, 42 };

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					list.add(arr1[i]);
				}

			}

		}
		System.out.println("common elements:" + list);
	}

}
