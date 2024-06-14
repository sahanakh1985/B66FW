package com.String;

import java.util.Scanner;

public class OccuranceOfCharactorInSentence {
	public static int countChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Enter the charactor");
		char ch = sc.next().charAt(0);
		int count = countChar(str, ch);
		System.out.println("the number of occurances of " + ch + " in the sentence " + count);

	}

}
