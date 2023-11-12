package com.takeo.bookinventorymgmt.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.takeo.bookinventorymgmt.exception.BookInventoryException;
import com.takeo.bookinventorymgmt.model.Book;
import com.takeo.bookinventorymgmt.service.BookInventoryService;

public class BookInventorController {
	
	
	
	
	public static void main(String[] args)  {
		
	
		BookInventoryService service=new BookInventoryService();
		
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(reader);
		
		
			try {
				
				
			while(true){
				String str = br.readLine();
				System.out.print("read   - 1 :");
				System.out.print("update - 2 :");
				System.out.print("delete - 3 :");
				System.out.print("insert - 4 :");
				String s=br.readLine();
				int val =0;
			    try{
			    	 val = Integer.parseInt(s);
			    	
			    }catch(NumberFormatException e){
			    	System.out.println("===> Please enter valid input=====> ");
			    }
			
				switch (val) {
				  case 1:
				    System.out.println(" read mode");
				    List<Book> bNamess=  service.getBooks();
				    for(Book bName:bNamess){
				    	System.out.println("BookName  "+bName.getBookName());
				    	System.out.println("Book Category  "+bName.getCategory());
				    	System.out.println("Price  "+bName.getPrice());
				    	System.out.println("Category  "+bName.getCategory());
				    	
				    	System.out.println("========================================================");
				    }
				    break;
				  case 2:
				    System.out.println("update mode");
				  List<String> bNames=  service.getAllBooksNames();
				  System.out.println("Please enter select one name ");
				  for(String bName:bNames){
					  System.out.print(bName+ " "+bName);
				  }
				  String updateBook=br.readLine();
				  service.updateBook(updateBook);
				    break;
				  case 3:
				    System.out.println("delete mode");
				    break;
				  case 4:
				    System.out.println("insert  mode");
				    service.addBook(br);
				    break;
				  
				}
			}
				
					
				} catch (BookInventoryException e) {
					System.out.println(e.getMessage());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
			
		}
	}


