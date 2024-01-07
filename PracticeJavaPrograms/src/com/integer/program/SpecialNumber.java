package com.integer.program;

public class SpecialNumber {
	public static int fact(int num) {
		int res = 1;
		for (int i = 1; i <= num; i++) {
			res = res * i;

		}
		return res;
	}

	public static void main(String[] args) {
		int num = 153;
		int sumOfDigits = 0;

		int temp = num;
		while (num > 0) {
			int last = num % 10;
			sumOfDigits = sumOfDigits + fact(last);
			num = num / 10;

		}
		System.out.println(temp);
	//	System.out.println(num);
		System.out.println(
				temp == sumOfDigits ? "the given number is special number" : "the given number is not special number");

	}

}
