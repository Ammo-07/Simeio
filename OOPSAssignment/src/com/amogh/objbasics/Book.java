package com.amogh.objbasics;

public class Book {
	private String title;
	private String author;
	private String category;
	private double price;
	void getDetails()
	{
		System.out.println("Title :"+title);
		System.out.println("Author :"+author);
		System.out.println("Category :"+category);
		
		if(price > 500) {
			System.out.println("It is a premium book");
		}else
			System.out.println("Standard book");
	}
	public Book(String title, String author, String category, double price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
}

