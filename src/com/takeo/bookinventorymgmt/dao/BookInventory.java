package com.takeo.bookinventorymgmt.dao;

import java.util.ArrayList;
import java.util.List;

import com.takeo.bookinventorymgmt.model.Book;

public class BookInventory {
	
	
	List bookList;
	
	public void addBook(Book book){
		
		bookList=new ArrayList();
		bookList.add(book);
		
		
	}

}
