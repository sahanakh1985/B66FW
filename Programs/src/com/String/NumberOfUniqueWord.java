package com.String;

import java.util.HashSet;

public class NumberOfUniqueWord {
	public static void main(String[] args) {
		String input = "hi how are you where are you when did you come";
		String[] words = input.split(" ");
		System.out.println("total number of words in a sentence "+words.length);

		HashSet<String> h = new HashSet<String>();
		for (String word : words) {

			h.add(word);

		}
		System.out.println("HashSet prints only unique elements "+h);
		System.out.println(h.size());
	}

}
