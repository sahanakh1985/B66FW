package array.programs;

import java.util.Scanner;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the all the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Original Array:");
		printArray(arr);

		moveZerosToEnd(arr);

		System.out.println("\nArray after moving zeros to the end:");
		printArray(arr);
	}

	public static void moveZerosToEnd(int[] arr) {
		int nonZeroIndex = 0;

		// Iterate through the array
		for (int i = 0; i < arr.length; i++) {
			// If the current element is non-zero, swap it with the first occurrence of zero
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[nonZeroIndex];
				arr[nonZeroIndex] = temp;

				// Move the nonZeroIndex to the next position
				nonZeroIndex++;
			}
		}
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}