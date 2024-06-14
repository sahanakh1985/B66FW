package array.programs;

public class ReverseGroups {
//	write an algorithm to reverse first 3 numbers, then next 3 numbers, then next
//	3 numbers, the number will be based on variable k. Array = [3,2,4,7,0,3,1,5,8, 4] k=3
//	OutPut = [4,2,3,3,0,7,8,5,1,4] in java and explain line by line
//	ChatGPT
//	Certainly! Here's a Java algorithm to reverse groups of three numbers based on the variable k:

	public static void main(String[] args) {
		int[] array = { 3, 2, 4, 7, 0, 3, 1, 5, 8, 4 };
		int k = 3;

		reverseGroups(array, k);

		// Print the result
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	private static void reverseGroups(int[] array, int k) {
		for (int i = 0; i < array.length; i += k) {
			int start = i;
			int end = Math.min(i + k - 1, array.length - 1);
			reverseSubarray(array, start, end);
		}
	}

	private static void reverseSubarray(int[] array, int start, int end) {
		while (start < end) {
			// Swap elements at start and end indices
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;

			// Move indices towards the center
			start++;
			end--;
		}
	}
}