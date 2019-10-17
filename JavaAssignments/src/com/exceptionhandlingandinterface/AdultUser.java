package com.exceptionhandlingandinterface;

public  class AdultUser implements LibraryUser {
  int age;
  String bookType;
  public void registerAccount(int age) {
  	if(age>12)
  		System.out.println("You have sucessfully registered under a Adult Account");
  	else
  		System.out.println("Sorry, Age must be greater than 12 to register as a Adult");
  }
  
public void requestBook(String bookType) {
	if(bookType=="Fiction")
  		System.out.println("Book issued sucessfully , please return the book within 10days");
  	else
  		System.out.println("Oops, you are allowed to take only adult Fiction books");
	
}
}
