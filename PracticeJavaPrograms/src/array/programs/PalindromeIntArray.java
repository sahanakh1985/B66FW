package array.programs;

public class PalindromeIntArray {

	public static boolean isPalindrome(int[] arr) {
		// Check if the array is a palindrome
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			if (arr[i] != arr[j]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// Example usage:
		// Replace the array below with your own integer array
		int[] integerArray = { 1, 2, 3, 4,5, 3, 2, 1 };

		if (isPalindrome(integerArray)) {
			System.out.println("The array is a palindrome.");
		} else {
			System.out.println("The array is not a palindrome.");
		}
	}
}