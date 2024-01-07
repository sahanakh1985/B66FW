package com.day2;

public class SampleDoWhile {
	public static void main(String[] args) {
		// CODE FOR FINDING PATH OF THE FILE
		String filePath = System.getProperty("user.dir");
		System.out.println(filePath);

		int b = 10;
		do {
			System.out.println("Th value of  b is " + b);
			b--;

		} while (b > 5);
	}

}
