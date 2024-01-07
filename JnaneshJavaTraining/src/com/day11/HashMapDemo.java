package com.day11;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1, "ammu");
		hs.put(2, "sahana");
		hs.put(3, "manya");
		hs.put(4, "chinnu");
		hs.put(4, "dhanya");
		hs.put(5, "rani");
		hs.put(null, "sa");
		hs.put(null, "ram");

		System.out.println("retrieving  only the values not keys");
		for (String name : hs.values()) {
			System.out.println(name);

		}
		System.out.println("--------------------------------");
		System.out.println("print the key set :" + hs.keySet());
		for (Integer key : hs.keySet()) {
			System.out.println(key + " " + hs.get(key));

		}
		System.out.println("_______________________________________________");
		System.out.println("retrieving both key and values");
		for (Map.Entry name : hs.entrySet()) {
			System.out.println(name.getKey() + " " + name.getValue());

		}
	}

}
