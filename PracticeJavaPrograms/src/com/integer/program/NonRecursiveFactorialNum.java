package com.integer.program;

public class NonRecursiveFactorialNum {
	public static int fact(int num) {
		int res = 1;
		for (int i = num; i >= 2; i--) {
			res = res * i;

		}
		return res;
	}

	public static void main(String[] args) {
		int n = 6;
		int result = fact(n);
		System.out.println(result);

	}

}
