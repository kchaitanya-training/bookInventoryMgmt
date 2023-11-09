package com.takeo.bookinventorymgmt.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.takeo.bookinventorymgmt.exception.BookInventoryException;
import com.takeo.bookinventorymgmt.service.BookInventoryService;

public class BookInventorController {
	
	
	
	
	public static void main(String[] args)  {
		
	
		BookInventoryService service=new BookInventoryService();
		
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(reader);
		
		
			try {
				String str = br.readLine();
				System.out.print("read -1 :");
				System.out.print("update -2 :");
				System.out.print("delete -3 :");
				System.out.print("insert  - 4 :");
				String s=br.readLine();
						
				int val = Integer.parseInt(s);
				switch (val) {
				  case 1:
				    System.out.println("read");
				 
				    break;
				  case 2:
				    System.out.println("update");
				    break;
				  case 3:
				    System.out.println("delete");
				    break;
				  case 4:
				    System.out.println("insert");
				    service.addBook(br);
				    break;
				  
				}
				
				
					
				} catch (BookInventoryException e) {
					System.out.println(e.getMessage());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
			
		}
	}


