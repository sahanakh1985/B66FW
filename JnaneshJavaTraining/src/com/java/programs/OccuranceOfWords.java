package com.java.programs;

import java.util.HashMap;
import java.util.Scanner;

public class OccuranceOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		String input = sc.nextLine();
		String[] words = input.split(" ");
		System.out.println(words.length);

		HashMap<String, Integer> map = new HashMap<>();
		for (String word : words) {
			if (map.containsKey(word)) {
				Integer value = map.get(word);
				map.put(word, value + 1);
			} else {
				map.put(word, 1);
			}

		}
		System.out.println(map);
	}

}
