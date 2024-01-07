package array.programs;

public class UniqueElementsInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 5, 6, 5, 8 };
		int[] occurred = new int[10];

		for (int i = 0; i < arr.length; i++) {
			occurred[arr[i]]++;
		}

		for (int j = 0; j < occurred.length; j++) {
			if (occurred[j] > 1) {
				System.out.println(j + " occurred " + occurred[j] + " times");
			} else if (occurred[j] == 1) {
				System.out.println(j + " is unique");
			}
		}
	}
}
