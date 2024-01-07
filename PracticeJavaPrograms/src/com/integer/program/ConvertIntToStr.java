package com.integer.program;

public class ConvertIntToStr {
	public static void main(String[] args) {
		int num = 12;

		try {
			String str = String.valueOf(num);
			System.out.println("converted string :" + str);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("please enter the valid input");
		}
	}

}
