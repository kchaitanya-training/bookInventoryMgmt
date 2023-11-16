package com.takeo.bookinventorymgmt.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import com.takeo.bookinventorymgmt.dao.BookInventory;
import com.takeo.bookinventorymgmt.exception.BookInventoryException;
import com.takeo.bookinventorymgmt.model.Book;

public class BookInventoryService {

	BookInventory bookInventory;
	
	

	public BookInventoryService() {
	
		this.bookInventory = new BookInventory();
	}



	public void addBook(BufferedReader br) throws BookInventoryException {

		

			while (true) {
				try {
					String str = br.readLine();
				System.out.print("Enter BookName or leave blank to exit :");
				String bookName = br.readLine();
				if(bookName.isEmpty()){
		break;
				}

				System.out.print("Enter category :");
				String category = br.readLine();
				System.out.print("Enter price :");
				String prc = br.readLine();
				double price = Double.parseDouble(prc);
				System.out.print("Enter bookDescription :");
				String bookDescription = br.readLine();

				Book book = new Book(bookName, category, price, bookDescription);
				bookInventory.addBook(book);
			} catch (IOException  e) {
				
				
				System.out.println("the system unable processing your request , Pleas try one more time.");
			} catch (NumberFormatException  e) {
				
				//e.printStackTrace();
				
				System.out.println("The price field value is wrong..Pls reenter with proper value");
			} 
			}

		}
	
	public List<String> getAllBooksNames(){
		return bookInventory.getBookNames();
	}
	
	
	public List<Book> getBooks(){
		return bookInventory.getBook();
	}
	
	public void updateBook(String bookName){
		
		List<Book> b=bookInventory.getBook();
		for(Book book:b){
			if(book.getBookName()==bookName){
				bookInventory.updateBookName(book,bookName);
			}
		}
	}
	
}
	

