package array.programs;

public class MinMaxNumInArray {
	public static void main(String[] args) {
		int[] arr = { 23, 45, 1, 65, 98, 34 };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i : arr) {
			if (min > i) {
				min = i;
			}
			if (max < i) {
				max = i;
			}

		}
		System.out.println("The least number in given array is :" + min);
		System.out.println("The highest number in given array is :" + max);
	}

}
