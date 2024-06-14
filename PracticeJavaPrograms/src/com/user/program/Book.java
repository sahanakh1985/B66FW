package com.user.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book implements Comparable<Book> {
	double price;
	String brand;
	int noOfPages;
	long slNo;

	public Book(double price, String brand, int noOfPages, long slNo) {
		this.price = price;
		this.brand = brand;
		this.noOfPages = noOfPages;
		this.slNo = slNo;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + ", brand=" + brand + ", noOfPages=" + noOfPages + ", slNo=" + slNo + "]\n";
	}

	public static void main(String[] args) {
		Book b1 = new Book(300, "Beta", 300, 123456789L);
		Book b2 = new Book(400, "Alpha", 130, 453267859L);
		Book b3 = new Book(699, "King", 90, 234516578L);

		ArrayList<Book> booksList = new ArrayList<>();
		booksList.add(b1);
		booksList.add(b2);
		booksList.add(b3);

	//	System.out.println(booksList);

		// sort the books in brand name ascending order
	//	Collections.sort(booksList);
	//	System.out.println(booksList);

		// sorting the price parameter of BOOK by Comparator in descending order
		Comparator pc = new PriceComparator();
		Collections.sort(booksList, pc.reversed());
		System.out.println(booksList);

		// use Lambda to sort noOfPages in Book object in ascending order
		Comparator<Book> pages = (p1, p2) -> (p1.noOfPages - p2.noOfPages);
		Collections.sort(booksList, pages);
		System.out.println(booksList);

	}

	@Override
	public int compareTo(Book o) {
		return this.brand.compareTo(o.brand);
	}

}
