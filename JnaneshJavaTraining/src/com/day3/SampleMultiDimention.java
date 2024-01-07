package com.day3;

import java.util.Scanner;

public class SampleMultiDimention {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of row");
		int row = sc.nextInt();

		System.out.println("enter the size of column");
		int column = sc.nextInt();

		int[][] array = new int[row][column];
		System.out.println("enter the array elements");
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				array[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(array[i][j] + " ");
			}

			System.out.println(" ");

		}
	}
}
