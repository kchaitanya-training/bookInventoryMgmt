package com.takeo.bookinventorymgmt.dao;

import java.util.ArrayList;
import java.util.List;

import com.takeo.bookinventorymgmt.exception.BookInventoryException;
import com.takeo.bookinventorymgmt.model.Book;

public class BookInventory {
	
	
	List bookList;
	
	public void addBook(Book book) throws BookInventoryException{
		
		
		
		if(bookList==null){
			bookList=new ArrayList();
		}
		
		if(bookList.size()==2){
			throw new BookInventoryException("the bucket is overloaded, please do sent any vlaues");
		}
			
		    bookList.add(book);
		
		
		
		
	}

}
