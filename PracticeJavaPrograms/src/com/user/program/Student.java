package com.user.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student implements Comparable<Student> {
	String name;
	String place;
	int age;
	int id;

	public Student(String name, String place, int age, int id) {
		super();
		this.name = name;
		this.place = place;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", place=" + place + ", age=" + age + ", id=" + id + "]" + "\n";
	}

	public static void main(String[] args) {
		Student s1 = new Student("sahana", "katteri", 38, 1);
		Student s2 = new Student("ammu", "Channapatna", 8, 2);
		Student s3 = new Student("dhanya", "Bangalore", 14, 3);
		Student s4 = new Student("sushma", "Mysore", 28, 4);

		ArrayList<Student> list = new ArrayList<Student>(Arrays.asList(s1, s2, s3, s4));

		System.out.println(list.size());
		// System.out.println(list.remove(s2));
		// System.out.println(list);
		// System.out.println(list.add(s2));
		// System.out.print(list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

	}

	@Override
	public int compareTo(Student o) {

		return this.name.compareTo(o.name);

	}

}
