package com.takeo.bookinventorymgmt.service;

import com.takeo.bookinventorymgmt.dao.BookInventory;
import com.takeo.bookinventorymgmt.model.Book;

public class BookInventoryService {
	
	BookInventory bookInventory;
	
	
	public void addBook(Book book){
		
		bookInventory=new BookInventory();
		bookInventory.addBook(book);
		
		
	}

}
