package com.exceptionhandlingandinterface;

public  class KidUser implements LibraryUser {
    int age;
    String bookType;
    
    
    
    
    public void registerAccount(int age) {
    	if(age<12)
    		System.out.println("You have sucessfully registered under a Kids Account");
    	else
    		System.out.println("Sorry, Age must be less than 12 to register as a Kid");
    }
   
    	
	@Override
	public void requestBook(String bookType) {
		// TODO Auto-generated method stub
		if(bookType=="Kids")
    		System.out.println("Book issued sucessfully , please return the book within 10days");
    	else
    		System.out.println("Oops, you are allowed to take only kids book");
    }
	}

