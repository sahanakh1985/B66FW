package array.programs;

import java.util.Scanner;

public class MoveZerosToEnd1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the array elments");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("the original array:");
		printArray(arr);
		moveZeroToEnd(arr);
		System.out.println("Array after moving zero to the end:");
		printArray(arr);

	}

	public static void moveZeroToEnd(int[] arr) {
		int nonZeroIndex = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[nonZeroIndex];
				arr[nonZeroIndex] = temp;

				nonZeroIndex++;

			}

		}

	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");

		}
		System.out.println();

	}

}
