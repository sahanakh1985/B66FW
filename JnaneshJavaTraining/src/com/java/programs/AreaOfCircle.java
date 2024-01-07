package com.java.programs;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
		double radius = sc.nextDouble();
		double areaOfCircle = 3.142 * radius * radius;
		System.out.println(areaOfCircle);

	}

}
