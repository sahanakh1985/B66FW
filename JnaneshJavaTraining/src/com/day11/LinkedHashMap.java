package com.day11;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1, "ammu");
		hs.put(2, "sahana");
		hs.put(3, "manya");
		hs.put(4, "chinnu");
		hs.put(5, "dhanya");
		hs.put(6, "rani");
		hs.put(null, "raj");

		System.out.println(hs.isEmpty());
		System.out.println("size of the map" + hs.size());

		System.out.println("retrieving  only the values");
		for (String name : hs.values()) {
			System.out.println(name);

		}
		System.out.println("_______________________________________________");
		System.out.println("retrieving both key and values");
		for (Map.Entry name : hs.entrySet()) {
			System.out.println(name.getKey() + " " + name.getValue());

		}
		System.out.println(hs.remove(hs));

	}

}
