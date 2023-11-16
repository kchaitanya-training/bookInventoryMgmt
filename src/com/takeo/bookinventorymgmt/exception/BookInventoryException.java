package com.takeo.bookinventorymgmt.exception;

public class BookInventoryException  extends Exception{
	
	String msg;
	
	public BookInventoryException(String msg) {
		super(msg);
	}
	
	public String toString() {
		
		return super.toString();
	}

}
