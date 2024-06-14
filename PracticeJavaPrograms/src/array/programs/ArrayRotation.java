package array.programs;

import java.util.Arrays;

public class ArrayRotation {

	public static void rotateArray(int[] arr, int k) {
		int n = arr.length;
		k = k % n; // Handle cases where k is greater than the array length

		reverseArray(arr, 0, n - 1);
		reverseArray(arr, 0, k - 1);
		reverseArray(arr, k, n - 1);
	}

	public static void reverseArray(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3; // Number of positions to rotate

		System.out.println("Original Array: " + Arrays.toString(arr));

		rotateArray(arr, k);

		System.out.println("Array after rotation: " + Arrays.toString(arr));
	}
}