package array.programs;

public class NumOfEvenOddNumInArray {
	public static void main(String[] args) {
		int[] arr = { 3, 57, 2, 7, 45, 98, 1, 3, 8, 84 };

		int even = 0;
		int odd = 0;
		for (int i : arr) {
			if (i % 2 == 0) {
				even++;
			} else {
				odd++;
			}

		}
		System.out.println("Number of even number:" + even);
		System.out.println("Number of odd number:" + odd);
	}

}
