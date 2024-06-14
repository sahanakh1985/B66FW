package com.string.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UniqueWordsInStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input = sc.nextLine();
		String[] words = input.split(" ");

		ArrayList<String> list = new ArrayList<>();
		for (String s : words) {
			if (!list.contains(s)) {
				list.add(s);
			}

		}
		/*
		 * Iterator<String> itr = list.iterator(); while (itr.hasNext()) { String str =
		 * itr.next(); System.out.println(str); }
		 */
		for (String string : list) {
			System.out.println(string);

		}
	}
}
