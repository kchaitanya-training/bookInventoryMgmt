package com.takeo.bookinventorymgmt.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLException;

import com.takeo.bookinventorymgmt.dao.BookInventory;
import com.takeo.bookinventorymgmt.exception.BookInventoryException;
import com.takeo.bookinventorymgmt.model.Book;

public class BookInventoryService {

	BookInventory bookInventory;

	public void addBook(BufferedReader br) throws BookInventoryException {

		

			while (true) {
				try {
					String str = br.readLine();
				System.out.print("Enter BookName :");
				String bookName = br.readLine();

				System.out.print("Enter category :");
				String category = br.readLine();
				System.out.print("Enter price :");
				String prc = br.readLine();
				double price = Double.parseDouble(prc);
				System.out.print("Enter bookDescription :");
				String bookDescription = br.readLine();

				Book book = new Book(bookName, category, price, bookDescription);

				bookInventory = new BookInventory();
				bookInventory.addBook(book);
			} catch (IOException  e) {
				
				
				System.out.println("the system unable processing your request , Pleas try one more time.");
			} catch (NumberFormatException  e) {
				
				//e.printStackTrace();
				
				System.out.println("The price field value is wrong..Pls reenter with proper value");
			} 
			}

		}
}
	

