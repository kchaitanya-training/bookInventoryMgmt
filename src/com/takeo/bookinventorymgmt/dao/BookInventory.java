package com.takeo.bookinventorymgmt.dao;

import java.util.ArrayList;
import java.util.List;

import com.takeo.bookinventorymgmt.exception.BookInventoryException;
import com.takeo.bookinventorymgmt.model.Book;

public class BookInventory {
	
	
	List bookList;
	public BookInventory() {
		this.bookList=new ArrayList();
	}
	
	public void addBook(Book book) throws BookInventoryException{
		
		
		
		if(bookList.size()==4){
			throw new BookInventoryException("the bucket is overloaded, please do not sent any vlaues");
		}
			
		    bookList.add(book);
		
		
		
		
	}

}
