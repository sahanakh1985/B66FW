package com.array;

public class PositionOfElementsInArray {
	public static void main(String[] args) {
		int[] arr = { 23, 12, 54, 17, 85 };
		int elementToFind = 85;
		for (int i = 0; i < arr.length; i++) {
			if (elementToFind == arr[i]) {
				System.out.println("element found at " + (i + 1) + " position");
				return;
			}

		}
		System.out.println("Element not found");
	}

}
