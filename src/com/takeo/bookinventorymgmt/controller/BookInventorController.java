package com.takeo.bookinventorymgmt.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.takeo.bookinventorymgmt.model.Book;
import com.takeo.bookinventorymgmt.service.BookInventoryService;

public class BookInventorController {
	
	
	
	
	public static void main(String[] args) throws IOException {
		BookInventoryService service;
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(reader);
		
		String str=br.readLine();
		
		while(true){
	
			System.out.print("Enter BookName :");
			String bookName=br.readLine();
			
			System.out.print("Enter category :");
			String category=br.readLine();
			System.out.print("Enter price :");
			String prc=br.readLine();
			double price=Double.parseDouble(prc);
			System.out.print("Enter bookDescription :");
			String bookDescription=br.readLine();
			
			Book book=new Book(bookName,category,price,bookDescription);
			service=new BookInventoryService();
			service.addBook(book);
			
			
			
			
			
		}
	}

}
