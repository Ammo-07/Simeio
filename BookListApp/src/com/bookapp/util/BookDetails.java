package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book> main(String[] args) {
		
		List<Book> books=Arrays.asList(
				 new Book("Java","Kathy",1,9000,"Tech"),
					new Book("Spring","John",2,1234,"Comic"),
					 new Book("Life","Robert",3,6789,"Scifi"),
					 new Book("Read","Robin",4,803,"Tech"),
					 new Book("Sleep","Ted",5,98143,"Selfhelp"));
		return books;
	}
}
