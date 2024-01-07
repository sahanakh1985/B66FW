package array.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfElementInArray2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n; // Declare array size
		System.out.println("Enter the total number of elements ");
		n = sc.nextInt(); // Initialize array size

		int arr[] = new int[n]; // Declare array
		System.out.println("Enter the elements of the array ");
		for (int i = 0; i < n; i++) // Initialize array
		{
			arr[i] = sc.nextInt();
		}

		Map<Integer, Integer> mp = new HashMap<>();
		// Traverse through array elements and count frequencies
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}

		/*
		 * // Enter the element whose frequency you want to know
		 * System.out.println("Enter the element whose frequency you want to know"); int
		 * ele = sc.nextInt(); int occ = 0;
		 * 
		 * // Traverse through map and check frequencies for (Map.Entry<Integer,
		 * Integer> entry : mp.entrySet()) { if (ele == entry.getKey()) { occ =
		 * entry.getValue(); } } // Print the element and its frequency
		 * System.out.println(ele + " occurred " + occ + " times ");
		 */

		System.out.println(mp);

	}
}
