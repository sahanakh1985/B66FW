package com.assignments;

public class CalculatorOperations {
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static int sub(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	public static int multiply(int num1, int num2) {
		int multi = num1 * num2;
		return multi;
	}

	public static int div(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}

	public static void main(String[] args) {
		int sum = add(2, 3);
		System.out.println("sum :" + sum);
		int sub = sub(20, 10);
		System.out.println("sub :" + sub);
		int res = multiply(4, 5);
		System.out.println("multiply :" + res);
		int div = div(3, 6);
		System.out.println("div :" + div);

	}

}
