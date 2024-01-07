package array.programs;

import java.util.Arrays;
import java.util.Scanner;

public class MergingOfTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of first array");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("enter the size of second array");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("enter the array elements");
		for (int i1 = 0; i1 < arr2.length; i1++) {
			arr2[i1] = sc.nextInt();

		}
		int[] resultArr = new int[arr1.length + arr2.length];

		for (int i = 0, j = 0; i < resultArr.length; i++) {
			if (i < arr1.length) {
				resultArr[i] = arr1[i];
			} else {
				resultArr[i] = arr2[j];
				j++;

			}

		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(resultArr));
	}

}
