package com.map.example;

import java.util.HashMap;

public class Student {
	public static void main(String[] args) {

		HashMap<String, String> studentMap = new HashMap<String, String>();
		studentMap.put("sahana", "sahankh@gmail.com");
		studentMap.put("sana", "sana@gmail.com");
		studentMap.put("sadhana", "sadhana@gmail.com");
		studentMap.put("ammu", "ammu@gmail.com");
		studentMap.put("ammu", "siri@yahoo.com");

		System.out.println(studentMap.size());
		System.out.println(studentMap.containsValue("mala"));
		System.out.println(studentMap.containsKey("sana"));
		System.out.println(studentMap.replace("sana", "mahesh"));
		System.out.println(studentMap.isEmpty());
		System.out.println(studentMap.entrySet());
		System.out.println(studentMap.get("ammu"));
		System.out.println(studentMap.keySet());
		System.out.println(studentMap.values());
		System.out.println(studentMap.replace("sadhana", "venu"));
		System.out.println(studentMap);

	}

}
