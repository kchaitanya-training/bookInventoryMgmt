package com.takeo.bookinventorymgmt.model;

public class Book {
	
	private int bookId;
	
	private String bookName;
	
	private String category;
	
	private double price;
	
	private String bookDescription;
	
	
	
	
	public Book(String bookName, String category, double price,
			String bookDescription) {

		this.bookName = bookName;
		this.category = category;
		this.price = price;
		this.bookDescription = bookDescription;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public String getBookDescription() {
		return bookDescription;
	}
	
	
	
	
	
	
	
	
	

}
