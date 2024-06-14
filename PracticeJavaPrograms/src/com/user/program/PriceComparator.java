package com.user.program;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {

		return (int) (o1.price - o2.price);
	}

}
