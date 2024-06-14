package com.String;

import java.util.HashMap;

public class OccurenceOfWordsInSentence {
	public static void main(String[] args) {
		String input = "hi how are you where are you when will you come";
		String[] words = input.split(" ");
		System.out.println(words.length);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
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
