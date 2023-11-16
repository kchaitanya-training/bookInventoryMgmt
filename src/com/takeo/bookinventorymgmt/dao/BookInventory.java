package com.takeo.bookinventorymgmt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.takeo.bookinventorymgmt.exception.BookInventoryException;
import com.takeo.bookinventorymgmt.model.Book;

public class BookInventory {
	
	
	List<Book> bookList;
	public BookInventory() {
		this.bookList=new ArrayList();
	}
	
	public void addBook(Book book) throws BookInventoryException{
		
		
		
		if(bookList.size()==4){
			throw new BookInventoryException("the bucket is overloaded, please do not sent any vlaues");
		}
			
		    bookList.add(book);
		
		
		
		
	}
	
	public List<Book> getBook(){
		return bookList;
	}
	
	
	public List<String> getBookNames(){
		List<String> list=new ArrayList();

		for(Book b:bookList){
			list.add(b.getBookName());
		}
		
		return list;
	}
	
	public void updateBookName(Book book,String bookName){
		for(Book b:bookList){
			if(b.getBookName().equals(book.getBookName())){
				
				b.setBookName(bookName);
				
			}
		}
	}

}
