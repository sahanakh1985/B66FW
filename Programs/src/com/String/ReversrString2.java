package com.String;

public class ReversrString2 {
	public static void main(String[] args) {
		String input = "java code";
		String rev = " ";
		
		for (int i = input.length() - 1; i >= 0; i--) {
			char temp = input.charAt(i);
			rev = rev + temp;

		}
		System.out.print(rev);

	}

}
