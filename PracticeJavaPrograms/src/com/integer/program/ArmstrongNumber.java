package com.integer.program;

import java.util.Scanner;

public class ArmstrongNumber {
	public static int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	public static int pow(int m, int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * m;

		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num value");
		int num = sc.nextInt();
		int temp = num;
		int sumoFThedigits = 0;
		int count = countDigit(num);
		while (num > 0) {
			int last = num % 10;
			sumoFThedigits = sumoFThedigits + pow(last, count);
			num = num / 10;
		}
		System.out.println(temp+" is " + (temp == sumoFThedigits ? " an armstrong number" : " not an armstrong number"));
	}

}
