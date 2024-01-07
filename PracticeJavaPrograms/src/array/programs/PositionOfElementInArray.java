package array.programs;

public class PositionOfElementInArray {
	public static void main(String[] args) {

		int[] arr = { 22, 43, 56, 72, 89, 67 };
		int elementToFind = 72;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elementToFind) {
				System.out.println("the position of" + elementToFind + "is :" + (i + 1));
			}

		}
	}

}
