package array.programs;

import java.util.Scanner;

public class OccuranceOfElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("enter the element");
		int element = sc.nextInt();

		int occ = 0;
		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				occ++;
			}
		}
		System.out.println(element + " occured " + occ + " times");

	}
}
