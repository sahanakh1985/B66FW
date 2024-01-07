package com.day9;

public class Session9 {

	public final void addition(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		final int i = 10;

		System.out.println(i);
		Session9 s=new Session9();
		s.addition(2, 3);

	}

}
