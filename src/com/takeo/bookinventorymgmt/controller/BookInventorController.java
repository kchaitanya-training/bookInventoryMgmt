package com.takeo.bookinventorymgmt.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.takeo.bookinventorymgmt.exception.BookInventoryException;
import com.takeo.bookinventorymgmt.service.BookInventoryService;

public class BookInventorController {
	
	
	
	
	public static void main(String[] args)  {
		
	
		BookInventoryService service=new BookInventoryService();
		
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(reader);
		
			
	
				try {
					service.addBook(br);
				} catch (BookInventoryException e) {
					System.out.println(e.getMessage());
				}
		
		
			
		}
	}


